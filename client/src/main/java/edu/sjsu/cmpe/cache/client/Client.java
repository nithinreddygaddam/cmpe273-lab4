package edu.sjsu.cmpe.cache.client;

public class Client
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Starting Cache Client");
        
        CRDTClient crdt = new CRDTClient();
        crdt.addServer("http://localhost:3000");
        crdt.addServer("http://localhost:3001");
        crdt.addServer("http://localhost:3002");

        crdt.put(1, "a");
        
        Thread.sleep(30*1000);
        
        crdt.put(1, "b");
        
        Thread.sleep(30*1000);
        
        System.out.println("Value in all servers: "+crdt.get(1));
        
        System.out.println("Existing Cache Client");
    }

}
