public class Main {
    public static void main(String[] args) {

        BankElkhal account = new BankElkhal();

        account.setName("Elkhal");
        account.setAccountNumber("11220099");
        account.setNationalId("30602051202257");
        account.setNationality("Egyptian");
        account.setPhoneNumber("01060073575");
        account.setEmail("mohamedbigboss247@gmail.com");
        account.setAddress("Mansoura");
        account.setDateOfBirth("2006-02-05");
        account.setGender("Male");
        account.setAccountType("Business");
        account.setBranchName("Mansoura");
        account.setBalance(20000000.0);

        System.out.println(account.getName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }
}