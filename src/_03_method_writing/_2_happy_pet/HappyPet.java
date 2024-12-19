package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	 static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 String petType = JOptionPane.showInputDialog("What kind of pet would you like?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while ( happinessLevel <= 80) {
			
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to make you pet enjoy life?", "Pet Happiness!", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "groom", "food", "water", "pet" }, null);
			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task ==  0) {
			groom(petType);
			}
			else if (task ==1) {
				food(petType);
				}
			else if (task ==2) {
				water(petType);
				}
			else if (task==3) {
				pet(petType);
				}else {
					System.out.println("Option is not avalibable.");
				}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >=80) {
				break;
			}
		}
	}

	private static Object happinessLevel(int i) {
		return null;
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void groom (String p) {
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog's tail is wagging!");
		} else if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat is purring.");
		}else{
			JOptionPane.showMessageDialog(null, "Your pet is happy.");
		}
		happinessLevel += 10;
	}  
	public static void pet (String p) {
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog's tail is wagging!");
		} else if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat is purring.");
		}else{
			JOptionPane.showMessageDialog(null, "Your pet is happy.");
		}
		happinessLevel+=  10;
	}  
	public static void food (String p) {
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog is full and his tail is wagging!");
		} else if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat is full and she is purring.");
		}else{
			JOptionPane.showMessageDialog(null, "Your pet is full and happy.");
		}
		happinessLevel+=  10;
		return ;
	}  
	public static void water (String p) {
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Your dog is not thirsty and his tail is wagging!");
		} else if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat is not thirsty and she is purring.");
		}else{
			JOptionPane.showMessageDialog(null, "Your pet is not thirsty and happy.");
		}
		happinessLevel+=  10;
	}  
	
}