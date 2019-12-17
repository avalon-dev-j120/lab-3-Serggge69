
package colorpicker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.*;

class RightPanel extends JPanel {
    
    public RightPanel(){
        setBackground(new Color(235, 235, 235));

        JSlider sliderRed = new JSlider(0, 255, 125);
        sliderRed.setMajorTickSpacing(50);//шаг линейки
        sliderRed.setPaintTicks(true);//видимость линейки
        sliderRed.setPaintLabels(true);//видимость значений на линейке
        sliderRed.setName("Red");
        sliderRed.addChangeListener(Okno.okno);

        JSlider sliderGreen = new JSlider(0, 255, 125);
        sliderGreen.setMajorTickSpacing(50);//шаг линейки
        sliderGreen.setPaintTicks(true);//видимость линейки
        sliderGreen.setPaintLabels(true);//видимость значений на линейке
        sliderGreen.setName("Green");
        sliderGreen.addChangeListener(Okno.okno);

        JSlider sliderBlue = new JSlider(0, 255, 125);
        sliderBlue.setMajorTickSpacing(50);//шаг линейки
        sliderBlue.setPaintTicks(true);//видимость линейки
        sliderBlue.setPaintLabels(true);//видимость значений на линейке
        sliderBlue.setName("Blue");
        sliderBlue.addChangeListener(Okno.okno);

        // Создаем метки-подписи для слайдеров:
        JLabel labelRed = new JLabel("Red:");
        JLabel labelGreen = new JLabel("Green:");
        JLabel labelBlue = new JLabel("Blue:");

        setLayout(new GridLayout(3, 1));
        
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add(labelRed, BorderLayout.WEST);
        top.add(sliderRed, BorderLayout.CENTER);
        add(top);
        
        JPanel center = new JPanel();
        center.setLayout(new BorderLayout());
        center.add(labelGreen, BorderLayout.WEST);
        center.add(sliderGreen, BorderLayout.CENTER);
        add(center);
        
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        bottom.add(labelBlue, BorderLayout.WEST);
        bottom.add(sliderBlue, BorderLayout.CENTER);
        add(bottom);
    }
}