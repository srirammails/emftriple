package org.social;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.emf.ecore.EPackage;
import org.social.network.NetworkFactory;
import org.social.network.NetworkPackage;
import org.social.network.Person;
import org.social.network.SocialNetwork;

import com.emftriple.ETriple;
import com.emftriple.jena.JenaModule;

/**
 * This is a simple example that shows how to store EObjects in a RDF repository with EmfTriple and how 
 * to query the RDF repository to retrieve EObjects. 
 * 
 * 
 * @author Guillaume Hillairet
 *
 */
public class Main {
	
	final static int NB_PERSON = 1000; // MAX 10000

	public static void main(String[] args) throws Exception {
		// Initialisation of EmfTriple with Jena TDB as Back end
		ETriple.init(new JenaModule());
		// Register the metamodel
		EPackage.Registry.INSTANCE.put(NetworkPackage.eNS_URI, NetworkPackage.eINSTANCE);
		
		// Read persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("network", null);
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Start of EmfTriple Example");
		
		// Create the social network
		SocialNetwork social = NetworkFactory.eINSTANCE.createSocialNetwork();
		social.setName("My Social");
		
		List<Person> all = createPersons();
		long startTime = System.currentTimeMillis();
		
		createConnections(all);
		
		social.getMembers().addAll(all);
		
		// Persist the Social Network
		em.getTransaction().begin();
		em.persist(social);
		em.flush();
		em.getTransaction().commit();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time to persist " + NB_PERSON + " persons: " + ((endTime - startTime) / 1000.0) + " sec");
		
		startTime = System.currentTimeMillis();
		
		// Query for all members with more than 45 friends.
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Person> moreThanFortyFiveFriends = em.createNativeQuery(
			"select ?e where { " +
			"	?e a <http://xmlns.com/foaf/0.1/Person> . " +
			"	?e <http://xmlns.com/foaf/0.1/knows> ?k " +
			"} " +
			"group by ?e " +
			"having (count(?k) > 45)", Person.class)
			.getResultList();
		em.getTransaction().commit();
		
		endTime = System.currentTimeMillis();
		System.out.println("Time to query: " + ((endTime - startTime) / 1000.0) + " sec");
		
		System.out.println("There is " + moreThanFortyFiveFriends.size() + " with more than 45 friends in your network.");

		System.out.println("End of EmfTriple Example");
	}

	private static List<Person> createPersons() {
		final List<Person> list = new ArrayList<Person>();
		int persons = 0;

		FileInputStream stream;
		try {
			stream = new FileInputStream("src/randomNames.csv");
			final BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
			String strLine = buffer.readLine();
			
			while (persons != NB_PERSON && strLine != null) {	
				final String[] names = strLine.split(",");
				persons+=1;
				
				final Person person = NetworkFactory.eINSTANCE.createPerson();
				person.setId(persons);
				person.setFirstName(names[0]);
				person.setLastName(names[1]);
				
				list.add(person);
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Created " + persons + " persons");
		return list;
	}
	
	private static List<Person> createConnections(List<Person> persons) {
		final Random r = new Random();
		int connect = 0;
		for (Person p: persons) {
			int nbConnections = r.nextInt(50);
			
			for (int i = 0; i < nbConnections; i++) {
				Person c = persons.get(r.nextInt(persons.size()));
				if (c != p && !p.getKnows().contains(c)) {
					p.getKnows().add(c);
					connect+=1;
				}
			}
		}
		
		System.out.println("Created " + connect + " connections");
		return persons;
	}
}

