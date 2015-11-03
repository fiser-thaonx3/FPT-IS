/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

/**
 *
 * @author nguye_000
 */
public class Words {
    private String keyword;
    private String value;

    public String getWord() {
        return keyword;
    }

    public void setWord(String keyword) {
        this.keyword = keyword;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Words(String keyword, String value) {
        this.keyword = keyword;
        this.value = value;
    }
    
}
