public class App {
    public static void main(String[] args) throws Exception {
        int codProduto = 4;

        switch(codProduto) {
            case 1:
                System.out.println("Produto 1");
                break;
            case 2:
                System.out.println("Produto 2");
                break;
            case 3:
                System.out.println("Produto 3");
                break;
            default:
                System.out.println("Produto não encontrado");
                break;
        }
    }
}
