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
    	Trade trade = new Trade();
    	trade.setTradeId(101);
    	trade.setQuantity(10);
    	trade.setSecurity("This is first round");
    	
        Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        Transaction trx = session.getTransaction();
        trx.begin();
        session.save(trade);
        trx.commit();
        
    }
}
