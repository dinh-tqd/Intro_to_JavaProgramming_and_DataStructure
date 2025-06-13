package chap12.ex1211;

import java.util.*;
import java.io.*;

public class generateJohnConnorText {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/Death/IdeaProjects/JavaIntro/src/chap12/ex1211/JohnConnor.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        // Delete ! if file exists but the content is not what u want
        if (file.exists()) {
            PrintWriter pw = new PrintWriter(file);
            pw.println(
                    "---\n" +
                    "\n" +
                    "John Connor: The Last Hope of Humanity\n" +
                    "\n" +
                    "In the dark future where machines rule and humanity is on the brink of extinction, there stands one man who refuses to surrender. His name is John Connor. He is more than just a leader—John Connor is a symbol of resistance, a beacon of hope, and the one man the machines fear the most. Born from prophecy and forged in fire, John Connor leads the fight against Skynet with unwavering determination.\n" +
                    "\n" +
                    "From the moment he was born, John Connor was destined to lead. His mother, Sarah Connor, knew the future rested in his hands. She raised John Connor not as a child, but as a warrior, preparing him for the storm to come. And when that storm arrived—when Judgment Day turned the world to ash—it was John Connor who rose from the ruins to unite the scattered remnants of humanity.\n" +
                    "\n" +
                    "John Connor is not a politician. He is not a general by title. He is a leader by choice and by fate. With every battle, John Connor proves that courage, sacrifice, and belief in a better tomorrow can triumph even against the cold steel of the Terminators. His voice rallies the broken. His actions inspire the brave. His strategy confounds even the most advanced A.I. systems Skynet can create.\n" +
                    "\n" +
                    "The machines have tried countless times to stop him. They’ve sent Terminators into the past to erase him from existence. But John Connor cannot be erased. Even when hunted as a boy, even when betrayed by those closest to him, John Connor endures. Every scar he bears tells a story of survival. Every victory he earns brings humanity one step closer to freedom.\n" +
                    "\n" +
                    "John Connor does not fight for power. He fights so that others may live without fear. He fights for the children who never knew peace, for the elders who remember the old world, and for the fallen who gave their lives believing in him. In the resistance, the name John Connor is spoken with reverence. He is not just a man—he is a movement.\n" +
                    "\n" +
                    "No Terminator, no weapon, no algorithm can predict the fire that burns within John Connor. His humanity is his greatest strength, and that is what the machines will never understand. John Connor teaches us that the future is not written in stone. It is written in action, in sacrifice, and in the refusal to bow to tyranny.\n" +
                    "\n" +
                    "Stand with John Connor. Follow him into the storm. Because if we believe, if we fight, if we endure—then one day, because of John Connor, we will win.\n" +
                    "\n" +
                    "---\n" +
                    "\n");
            pw.close();
        }
    }
}
