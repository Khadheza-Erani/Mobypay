package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidCredentials")
    public static Object invalidCredentialsDataSet(){
        Object[][] dataset = {
                {"Mst.Khadheza Sultana","Erani","khadhezazaman@gmail.com","mobile"},
                {"","Erani","khadhezazaman@gmail.com","01795015917"},
                {"Mst.Khadheza Sultana","","khadhezazaman@gmail.com","01795015917"},
                {"Mst.Khadheza Sultana","Erani","","01795015917"},
                {"Mst.Khadheza Sultana","Erani","khadhezazaman@gmail.com",""},
                {"","","khadhezazaman@gmail.com","01795015917"},
                {"Mst.Khadheza Sultana","","khadhezazaman@gmail.com",""},
                {"","Erani","","01795015917"},
                {"firstname","lastname","email","phone"},


        };
        return dataset;
    }
}
