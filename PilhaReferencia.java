public class PilhaReferencia{
    int tamanho = 0;
    Termo topo;

    public boolean isVazia(){
        return tamanho==0;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void push(Termo termo){
        if(tamanho!=0){
            termo.proximo = topo;
        }
        topo = termo;
        ++tamanho;
    }

    public Termo pop() throws Exception{
        if(tamanho==0){
            throw new Exception("Não há elementos na pilha");
        }
        Termo termo = topo;
        topo =  topo.proximo;
        --tamanho;
        return termo;
    }
}
