public class HondaPrototype extends MotoPrototype{
    protected HondaPrototype(HondaPrototype honda){
        this.valorCompra = honda.getValorCompra();
    }
    
    public HondaPrototype(){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo(){
        return "Modelo: Honda CG 125\n" + 
        "Valor: R$" + getValorCompra();
    }
    
    @Override
    public MotoPrototype clonar(){
        return new HondaPrototype(this);
    }
}