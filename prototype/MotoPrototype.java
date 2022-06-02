public abstract class MotoPrototype{
    protected double valorCompra;
    
    public abstract String exibirInfo();
    
    public abstract MotoPrototype clonar();
    
    public double getValorCompra(){
        return valorCompra;
    }
    
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
}