package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.DivHelper;
import digital.innovation.one.utils.operacao.internal.MulHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;
import digital.innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MulHelper mulHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        mulHelper = new MulHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

    public int mul(int a, int b){
        return mulHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

}
