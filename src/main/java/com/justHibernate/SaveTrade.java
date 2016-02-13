package com.justHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class SaveTrade 
{
    public static void main( String[] args )
    {
    	CompositeKey ck = new CompositeKey();
    	ck.buyer = "person1";
    	ck.seller = "person2";
    	Trade trade = new Trade();
    	trade.setTradeId(101);
    	trade.setQuantity(10);
    	trade.setSecurity("This is first round");
    	trade.setKey(ck);
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        Transaction trx = session.getTransaction();
        trx.begin();
        session.save(trade);
        trx.commit();
        
    }
}
