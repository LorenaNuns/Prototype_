public class YamahaPrototype extends MotoPrototype{
     protected YamahaPrototype(YamahaPrototype yamaha){
        this.valorCompra = yamaha.getValorCompra();
    }
    
    public YamahaPrototype(){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo(){
        return "Modelo: Yamaha XTZ 125\n" + 
        "Valor: R$" + getValorCompra();
    }
    
    @Override
    public YamahaPrototype clonar(){
        return new YamahaPrototype(this);
    }
}