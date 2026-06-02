

public class activity3{

			
		public String adjustDevice(String device,int value) {
			
			String status = switch (device){
			// null
			case null -> "Invalid";
			//std
			
			case String d when d.equals("Thermostat") && value >40 -> "[Thermostat] Warning: Temperature high.";
			
			case "Thermostat" -> "[Thermostat] Temperature is set to <value>.";
			
			case "Light" -> " [Light] Adjusting brightness to <value>%.";
			
			default -> "Unknown device";
			
			};
			return status;
			
			}
		
		public static void main(String[]args) {
			activity3 obj = new activity3();
			
			System.out.println(obj.adjustDevice("THERMOSTAT", 40));
			System.out.println(obj.adjustDevice("THERMOSTAT", 25));
			System.out.println(obj.adjustDevice("LIGHT", 50));
			
		}
		
		
}
