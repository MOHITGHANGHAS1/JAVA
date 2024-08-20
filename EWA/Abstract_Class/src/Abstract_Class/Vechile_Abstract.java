package Abstract_Class;



	abstract class Bike {
		Bike() {
			System.out.println("Bike is created");
		}

		abstract void run();

		void changeGear() {
			System.out.println("gear changed");
		}
	}

	class Honda extends Bike {
		void run() {
			System.out.println("running smootly..");
		}
	}

	public class Vechile_Abstract {
		public static void main(String args[]) {
			Bike obj = new Honda();
			obj.run();
			obj.changeGear();
			System.out.println("MOHIT GHANGHAS 22CSU255");
		}


	}


