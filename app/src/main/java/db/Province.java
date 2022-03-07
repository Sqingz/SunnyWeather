package db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;
    private int provinceCode;
    private String provinceName;
    public int getId(){
        return id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
