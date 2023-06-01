public class ListadeExercicios {
    public static void main(String[] args) {
        boolean V = true, F = false;
        System.out.println("1) Determine a negação da proposição “Maria é estudiosa e Marcelo decora”\n" +
                "a) Maria é estudiosa ou Marcelo decora.\n" +
                "b) Maria não é estudiosa e Marcelo decora.\n" +
                "c) Maria não é estudiosa ou Marcelo decora.\n" +
                "d) Maria não é estudiosa ou Marcelo não decora."+"\n"+"\n"+
                "1- Resposta: letra D\n" +
                "!V && !V, logo F e F dessa forma "+ (!V && !V)+"\n");
        System.out.println("2) \"Se estiver chovendo OU se eu esquecer meu guarda-chuva, vou ficar molhado.\"\n" +
                "P: Está chovendo?\n" +
                "Q: Eu esqueci meu guarda-chuva?\n" +
                "R: Vou ficar molhado?"+"\n"+"\n"+
                "2 - Resposta: \n" +
                "P || Q = R \n" +
                "V || V = "+ (V || V)+ "\n"+
                "F || V = "+ (F || V)+ "\n"+
                "V || F = "+ (V || F)+ "\n"+
                "F || F = "+ (F || F)+ "\n");
    }
}
