/*
public List<String> ler() {
        //Mesmo esquema do m�todo acima, mas agora usamos a caixa de abrir arquivo.
        if (fileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return new ArrayList<String>();
        }
        File file = fileChooser.getSelectedFile();
    //Criamos a lista que conter� as linhas lidas do arquivo.
    List<String> linhas = new ArrayList<String>();

    //Criamos um scanner, para ler do arquivo.
    Scanner scan = null;
    try {
        scan = new Scanner(file);
        //Enquanto o arquivo tiver linhas
        while (scan.hasNextLine()) {
            //Lemos a linha
            linhas.add(scan.nextLine());
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        //Fechamos o arquivo
        if (scan != null) {
            scan.close();
        }
    }
    //Retornamos o texto lido.
    return linhas;
}
}*/

	

