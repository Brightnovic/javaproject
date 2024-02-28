public class bank {

  public static void main(String[] args) {
    Banking banking = new Banking();

    banking.first_name = "Ayo";
    banking.ChangeAtmPin();

    System.out.println(banking.first_name);
  }

}

class Banking {
  String first_name;
  String middle_name;
  String last_name;
  int nin;
  int Bvn;
  int date_of_birth;
  String country;
  String state;
  String town;
  String city;
  String mothers_middle_name;
  int account_number;
  String username;
  int transfer_pin;
  int Atm_pin;

  public int load(int amount) {
    System.out.println("your request is being processed!");
    System.out.println("your loan is ready the the amount is:");
    return amount;
  }

  public int transfer(int amount) {
    System.out.println("your request is being processed!");
    System.out.print(amount);
    System.out.print(" transfer is successful ");
    return amount;
  }

  public void ChangeAtmPin() {
    System.out.println("your request is being processed!");
    System.out.println("your Atm pin has been changed sucessfully");

  }

}