public class Cliente{
    public static void main (String[] args){
        HondaPrototype prototipoHonda = new HondaPrototype();
        Suzuki_IntruderPrototype prototipoSuzuki = new Suzuki_IntruderPrototype();
        YamahaPrototype prototipoYamaha = new YamahaPrototype();
        
        /*HONDA*/
        MotoPrototype hondaNova = prototipoHonda.clonar();
        hondaNova.setValorCompra(27900.0);
        /*SUZUKI*/
        MotoPrototype suzukiNova = prototipoSuzuki.clonar();
        hondaNova.setValorCompra(30000.0);
        /*YAMAHA*/
        MotoPrototype yamahaNova = prototipoYamaha.clonar();
        hondaNova.setValorCompra(35000.0);
        
        /*HONDA*/
        MotoPrototype hondaUsada = prototipoHonda.clonar();
        hondaUsada.setValorCompra(20900.0);
        /*SUZUKI*/
        MotoPrototype suzukiUsada = prototipoSuzuki.clonar();
        hondaUsada.setValorCompra(23000.0);
        /*YAMAHA*/
        MotoPrototype yamahaUsada = prototipoYamaha.clonar();
        hondaUsada.setValorCompra(27000.0);
    
        /*INSTÂNCIA PROTOTYPE CONCRETE*/
        System.out.println(prototipoHonda.exibirInfo());
        System.out.println(prototipoSuzuki.exibirInfo());
        System.out.println(prototipoYamaha.exibirInfo());
        
        /*INTÂNCIA DA INTÂNCIA (CLONES)*/
        System.out.println("\nMODELOS NOVOS");
        System.out.println(hondaNova.exibirInfo());
        System.out.println(suzukiNova.exibirInfo());
        System.out.println(yamahaNova.exibirInfo());
        
        System.out.println("\nMODELOS USADOS");
        System.out.println(hondaUsada.exibirInfo());
        System.out.println(suzukiUsada.exibirInfo());
        System.out.println(yamahaUsada.exibirInfo());
        
        System.out.println(prototipoHonda.exibirInfo());
        /*INSTÂNCIA PROTOTYPE CONCRETE*/
    }
}