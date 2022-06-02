public class Suzuki_IntruderPrototype extends MotoPrototype{
    protected Suzuki_IntruderPrototype(Suzuki_IntruderPrototype suzuki){
        this.valorCompra = suzuki.getValorCompra();
    }
    
    public Suzuki_IntruderPrototype(){
        valorCompra = 0.0;
    }
    
    @Override
    public String exibirInfo(){
        return "Modelo: Suzuki Intruder 125\n" + 
        "Valor: R$" + getValorCompra();
    }
    
    @Override
    public Suzuki_IntruderPrototype clonar(){
        return new Suzuki_IntruderPrototype(this);
    }
}