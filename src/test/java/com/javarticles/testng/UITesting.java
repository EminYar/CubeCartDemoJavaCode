package com.javarticles.testng;

import org.testng.annotations.Test;

public class UITesting {
    @Test(groups="someFeature")
    public void ui1() {
        System.out.println("UI1 testing");
    }
    
    @Test
    public void ui2() {
        System.out.println("UI2 testing");
    }
        
    @Test
    public void ui3() {
        System.out.println("UI3 testing");
    }
    
    @Test
    public void ui4() {
        System.out.println("UI4 testing");
    }
}
