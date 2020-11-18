package tdtu.l.music;

import java.util.ArrayList;
import java.util.List;

public class casi {
    private String name;
    private  int hinhanh;

    public casi(String name) {
        this.name = name;
        this.hinhanh = Integer.parseInt(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
    public static List<casi> getAll(){
        List<casi> list = new ArrayList<>();
        list.add(new casi("Sơn Tùng"));
        list.add(new casi("Đan Trường"));
        list.add(new casi("Cẩm Ly"));
        list.add(new casi("Ngô Kiến Huy"));
        list.add(new casi("Ổ Gà"));

        return  list;
    }
}
