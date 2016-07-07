# ShowInputDialog
Ejemplo de como utilizar todos los métodos del showInputDialog

# Capturas
### Formulario Principal ###
![Formulario Principal](/Capturas/FrmPrincipal.png)

### Opciones del ComboBox ###
![Opciones del Combo](/Capturas/ComboBox opciones.png)

### Input Normal con mensaje y valor inicial ###
![Input Normal](/Capturas/Input Normal.png)

### Input con titulo y tipo de mensaje ###
![Input con titulo y tipo de msj](/Capturas/Input con titulo y tipo de msj.png)

### Input con icono personalizado ###
![Input Cambio de Icono](/Capturas/Input Cambio de Icono.png)

### Input con icono personalizado y combobox ###
![Input con ComboBox](/Capturas/Input con ComboBox.png)

# Código
El siguiente código fue escrito dentro del botón *buscar* para más comodidad utilizamos un try-catch para capturar un error de dato nulo y utilizamos un switch para el combo box.
```sh
try {
            switch (cbInputDialog.getSelectedIndex()) {
            case 0:
                txtValor.setText(showInputDialog("Ingresa un número"));
                break;
            case 1:
                txtValor.setText(showInputDialog(this, "Ingresa un nombre:"));
                break;
            case 2:
                txtValor.setText(showInputDialog("Ingresa un número:", "Pedro"));
                break;
            case 3:
                txtValor.setText(showInputDialog(this, "Ingresa un número:", "Pedro"));
                break;
            case 4:
                txtValor.setText(showInputDialog(this, "Ingresa un valor", "VALORES", JOptionPane.INFORMATION_MESSAGE));
                break;
            case 5:
                txtValor.setText(showInputDialog(this, "Ingresa un cliente", "CLIENTE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ShowInputDialogs.class.getResource("clientes.png")), null, "Julieta").toString());
                break;
            case 6:
                txtValor.setText(showInputDialog(this, "Ingresa un cliente", "CLIENTE", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ShowInputDialogs.class.getResource("clientes.png")), val, "Julieta").toString());
                break;
        }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        ```
