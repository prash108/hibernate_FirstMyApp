package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FoodDAO {

	public static void main(String[] args) {
    
		//step1 create obj of FoodDTO
				FoodDTO food=new FoodDTO();
				food.setName("masalaParathe");
				food.setPrice(129);
				food.setQuantity(4);
				food.setType("Main");
				food.setAvailable(true);
				
				//create obj of Configuration
				Configuration config=new Configuration();
				// load resources
				//loads cfg file
				//load mapping file
				config.configure();
				config.addAnnotatedClass(FoodDTO.class);
				//obtain sessionFactory
				SessionFactory sf=config.buildSessionFactory();
			//obtain session obj
				Session sess=sf.openSession();
				
				
				sess.save(food);
				
				
				
				
				Transaction tx=sess.beginTransaction();
				tx.commit();
				
				
				
	}

}
