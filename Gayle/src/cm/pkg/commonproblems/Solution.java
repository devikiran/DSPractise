package cm.pkg.commonproblems;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Solution {
	
	
	
public static void main(String[] args) {
	ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	rwl.readLock().unlock();
	System.out.println("Read-Unlock-1");
	rwl.readLock().lock();
	System.out.println("read lock 1");
	rwl.readLock().lock();
	System.out.println("read lock 2");
	rwl.readLock().unlock();
	System.out.println("read unlcok 2");
	rwl.writeLock().lock();
	System.out.println("write lockl 1");
	rwl.writeLock().unlock();
	System.out.println("write unlcok");
	
}
}
