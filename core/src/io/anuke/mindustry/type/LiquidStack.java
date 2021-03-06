package io.anuke.mindustry.type;

public class LiquidStack{
    public Liquid liquid;
    public float amount;

    public LiquidStack(Liquid liquid, float amount){
        this.liquid = liquid;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "LiquidStack{" +
        "liquid=" + liquid +
        ", amount=" + amount +
        '}';
    }
}
