package com.example.vucutkitleindeksihesaplayici;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox kadinCheck,erkekCheck;
    Button hesapla;
    EditText boy,kilo;
    double boy1,kilo1;
    TextView sonuc,sonuc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainn);

        kadinCheck=findViewById(R.id.kadincheckbox);
        erkekCheck=findViewById(R.id.erkekcheckbox);
        hesapla=findViewById(R.id.hesaplaButonu);
        boy=findViewById(R.id.boyedit);
        kilo=findViewById(R.id.kiloedit);
        sonuc=findViewById(R.id.sonuc);
        sonuc2=findViewById(R.id.sonuc2);
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (kadinCheck.isChecked()&&erkekCheck.isChecked()){
                    Toast.makeText(getApplicationContext(),"Aynı anda iki cinsiyetiniz olamaz...",Toast.LENGTH_LONG).show();

                }
                else if(!kadinCheck.isChecked()&&!erkekCheck.isChecked()){
                    Toast.makeText(getApplicationContext(),"Lütfen cinsiyetinizi seçiniz...",Toast.LENGTH_LONG).show();
                }
                else {

                    boy1=Double.parseDouble(boy.getText().toString());
                    kilo1=Double.parseDouble(kilo.getText().toString());

                        double cozum=kilo1/(boy1*boy1);
                        int sonucc=(int)cozum;
                        sonuc.setText(String.valueOf("Vücut Kitle İndeksiniz="+sonucc));
                        if (0<cozum&&cozum<=18.4){
                            sonuc2.setText("Zayıfsınız. Uzunluğunuza göre uygun ağırlıkta olmadığınızı, zayıf olduğunuzu gösterir. Zayıflık, bazı hastalıklar için risk oluşturan ve istenmeyen bir durumdur. Boyunuza uygun ağırlığa erişmeniz için yeterli ve dengeli beslenmeli, beslenme alışkanlıklarınızı geliştirmeye özen göstermelisiniz.");
                        }
                        else if(18.4<cozum&&cozum<=24.9){
                            sonuc2.setText("Normalsiniz. Uzunluğunuza göre uygun ağırlıkta olduğunuzu gösterir. Yeterli ve dengeli beslenerek ve düzenli fiziksel aktivite yaparak bu ağırlığınızı korumaya özen gösteriniz.");

                        }
                        else if(24.9<cozum&&cozum<=29.9){
                            sonuc2.setText("Fazla Kilolusunuz. Boyunuza göre vücut ağırlığınızın fazla olduğunu gösterir. Fazla kilolu olma durumu gerekli önlemler alınmadığı takdirde pek çok hastalık için risk faktörü olan obeziteye (şişmanlık) yol açar.");

                        }
                        else if(29.9<cozum&&cozum<=34.9){
                            sonuc2.setText("Şişman (Obez) - I. Sınıfsınız. Boyunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir. Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür. Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir. Lütfen, sağlık kuruluşuna başvurunuz.");

                        }
                        else if(34.9<cozum&&cozum<=44.9){
                            sonuc2.setText("Şişman (Obez) - II. Sınıfsınız. Uzunluğunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir. Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür. Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir. Lütfen, sağlık kuruluşuna başvurunuz.");

                        }
                        else if (cozum<0){

                            sonuc2.setText("Vücut kitle indeksiniz sıfırdan küçük olamaz...");
                        }
                        else{
                            sonuc2.setText("Aşırı Şişman (Aşırı Obez) - III. Sınıfsınız. Boyunuza göre vücut ağırlığınızın fazla olduğunu bir başka deyişle şişman olduğunuzun bir göstergesidir. Şişmanlık, kalp-damar hastalıkları, diyabet, hipertansiyon v.b. kronik hastalıklar için risk faktörüdür. Bir sağlık kuruluşuna başvurarak hekim / diyetisyen kontrolünde zayıflayarak normal ağırlığa inmeniz sağlığınız açısından çok önemlidir. Lütfen, sağlık kuruluşuna başvurunuz.");

                        }





                }

            }
        });

    }


}