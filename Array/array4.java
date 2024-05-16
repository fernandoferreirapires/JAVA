public class array4 {
    public static void main(String[] args){

        final int tam = 5;
        char[] gabarito = {'a', 'c', 'b', 'a', 'd'};
        char[] respostas = new char[tam];
        int nota = 0;

        respostas[0] = 'b';
        respostas[1] = 'c';
        respostas[2] = 'b';
        respostas[3] = 'c';
        respostas[4] = 'd';

        for(int i = 0; i < gabarito.length; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }
        System.out.printf("Aluno tirou nota: %d", nota);
    }
}
