package level1_basics.exercise04_CustomerBankAccount;

public class Customer {
    private String name;
    private String cpf;
    private String email;

    public Customer(String name, String cpf, String email) {
        this.setName(name);
        this.setCpf(cpf);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Don't allow empty name");
        } else {
            this.name = name;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()) {
            System.out.println("Don't allow empty cpf");
        } else {
            this.cpf = cpf;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("Don't allow empty email");
        } else {
            this.email = email;
        }
    }

    public void showCustomerInformation() {
        System.out.println("---Customer Information---");
        System.out.println("Name: " + getName());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
    }

}
