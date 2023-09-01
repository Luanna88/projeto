package Filmes;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.*;

public class InserirDados extends JFrame  {
	
	private Connection con;
	private Statement st;
	
	public InserirDados() throws SQLException{
		String driver = "org.postgresql.Driver";
		String sUsuario = "postgres";
		String sSenha = "flor@2024";
		String sFonte = "jdbc:postgresql://localhost:5432/recomendacaofilmes";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(sFonte, sUsuario, sSenha);
			JOptionPane.showMessageDialog(this,"Banco conectado com sucesso!","Mensagem", JOptionPane.WARNING_MESSAGE);
		}catch (SQLException eSQL) {
			// exceções de SQL
			eSQL.printStackTrace();
			JOptionPane.showMessageDialog(this,"Falha na conexão com o banco!\n" +"Mensagem: " + eSQL.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
		}catch (Exception e) {
			// demais exceções
			e.printStackTrace();
			JOptionPane.showMessageDialog(this,"Falha na conexão com o banco!\n" +"Mensagem: " + e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		try{
			//cria statement para consultar banco de dados
			st = con.createStatement();
			//Cadastro de valores pre-definidos
			st.executeUpdate ("INSERT INTO tabelaFilmes values (1,'Vermelho, Branco e Sangue Azul',2023,7.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (2 ,'Que horas Eu te pego?',2023,6.5)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (3 ,'Maestro',2023)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (4 ,'Asteroid City',2023,6.7)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (5,'Branca de Neve e os sete Anões',2024)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (6,'A Pequena Sereia',2023,7.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (7,'Felicidade para Principiantes',2023,6.0");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (8,'Belo Desastre',2023,5.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (9,'Minha Culpa',2023,6.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (10,'Rocky Aur Rani Kii Prem Kahaani',2023,7.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (11,'Meus Sogros estão pro Crime',2023,5.4)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (12,'Titanic',1997,7.9)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (13,'Scott Pilgrim Contra o Mundo',2010,7.5)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (14,'Love,(II)',2015,6.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (15,'Orgulho & Preconceito',2005,7.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (16,'Continênncia ao Amor',2022,6.7)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (17,'Atão os Ossos',2022,6.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (18,'Miraculous: As Aventuras de Ladybug - O Filme',2023,6.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (19,'Cidade Perdida',2022,6.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (20,'Cinquenta Tons de Cinza',2015,4.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (21,'Forrest Gump: O Contador de Historias',1994,8.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (22,'La La Land: Cantando Estações',2016,8.0)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (23,'Passagens',2023,7.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (24,'Ghosted: Sem Resposta,(I)',2023,5.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (25,'Vidas Passadas',2023,8.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (26,'Diário de uma Paixão',2004,7.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (27,'Adoráveis Mulheres',2019,7.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (28,'Um Lugar Bem Longe Daqui',2022,7.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (29,'Crepúsculo,(I)',2008,5.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (30,'As Patricinhas de Beverly Hills',1995,6.9)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (31,'Satyaprem Ki Katha',2023,7.4)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (32,'Gênio Indomável',1997,8.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (33,'Thor: Amor e Trovão',2022,6.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (34,'10 Coisas que Eu Odeio em Você',1999,7.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (35,'Amor a Toda Prova',2011,7.4)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (36,'Drácula de Bram Stoker',1992,7.4)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (37,'After,(I)',2019,5.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (38,'365 Dias',2020,3.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (39,'Amizade Colorida',2011,6.5)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (40,'A Princesa Prometida',1987,8.0)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (41,'She Came to Me',2023)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (42,'Lolita',1997,6.8)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (43,'Brilho Eterno de uma Mente sem Lembranças',2004,8.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (44,'Zoey 102',2023,5.0)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (45,'Amor à Queima Roupa',1993,7.9)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (46,'Um Principe em Nova York',1988,7.1)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (47,'Quero ser Grande',1988,7.3)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (48,'Esposa de Mentirinha',2011,6.4)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (49,'A Escolha Perfeita',7.2)");
			st.executeUpdate ("INSERT INTO tabelaFilmes values (50,'Me Chame pelo Seu Nome',2017,7.8)");


		}catch(SQLException eSQL){
			JOptionPane.showMessageDialog(this,"Erro na expressão do INSERT!\n" +"Mensagem: " + eSQL.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		try {
			st.close();
			con.close();
		}catch(Exception exception){
			exception.printStackTrace();
			System.exit(2);
		}
		Container P = getContentPane();
		P.setLayout(new FlowLayout());
		JLabel mensagem = new JLabel("Você inseriu dados em uma tabela usando INSERT!");
		P.add(mensagem);
	}
	public static void main(String args[]) throws SQLException{
		InserirDados ex = new InserirDados();
		ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ex.setVisible(true);
		ex.setTitle("USANDO INSERT");
		ex.setSize(400,200);
	}

}
