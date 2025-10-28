package com.radhika.Lecture25;

import java.util.ResourceBundle;

class ResourcePool {
    private static int count = 1;
    private ResourcePool(){
        System.out.println("Resource Allocated");
        count++;
    }
    public static ResourcePool getInstance(){
        if(count>5) {
            System.out.println("Limited Resources only. Max provided");
            return null;
        }
        return new ResourcePool();
    }
}

public class Main2 {
    public static void main(String[] args) {
        ResourcePool r1 = ResourcePool.getInstance();
        ResourcePool r2 = ResourcePool.getInstance();
        ResourcePool r3 = ResourcePool.getInstance();
        ResourcePool r4 = ResourcePool.getInstance();
        ResourcePool r5 = ResourcePool.getInstance();
        ResourcePool r6 = ResourcePool.getInstance();
    }


}