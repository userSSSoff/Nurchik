public class area {int shirinu;
    int vysotu;
    int ravny;

    public void triugolnik() {
        int result = (shirinu + vysotu + ravny) / 2;
        System.out.println("Ответь: " + Math.sqrt(result * (result - shirinu) * (result - vysotu) * (result - ravny)));
}}
