package seu_grupo;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomacao {
    private WebDriver driver;
    private String uRL_BASE;
    private String cAMINHO_DRIVER;

    /**
     * @param driver
     */
     public class Desafio {
    private WebDriver driver;
    private final String URL_BASE = "https://automationexercise.com/";
    private final String CAMINHO_DRIVER = "src/test/resource/chromedriver.exe";

    public void setDriver2(WebDriver driver2) {
        this.driver2 = driver2;
    }

    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/isaac/automacao-teste-selenium/src/test/resource/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testeLoginValido() {
        driver.get("https://automationexercise.com/");

        // Preencher campo de e-mail
        driver.findElement(By.id("email")).sendKeys("seu_email@exemplo.com");

        // Clicar no botão de login
        driver.findElement(By.id("SubmitLogin")).click();

        // Verificar se o login foi bem-sucedido
        assertTrue(driver.findElement(By.className("logout")).isDisplayed());
    }

    @Test
    public void testeAdicionarProdutoAoCarrinho() {
        driver.get("https://automationexercise.com/index.php");

        // Pesquisar por um produto
        driver.findElement(By.id("search_query_top")).sendKeys("vestido");
        driver.findElement(By.name("submit_search")).click();

        // Adicionar o primeiro produto da lista ao carrinho
        driver.findElement(By.cssSelector(".product_list .product_img_link")).click();
        driver.findElement(By.name("Submit")).click();

        // Verificar se o produto foi adicionado ao carrinho
        assertTrue(driver.findElement(By.cssSelector(".layer_cart_product .product-name")).isDisplayed());

        // Navegar para a página do carrinho de compras
        driver.findElement(By.cssSelector(".layer_cart_cart a")).click();

        // Verificar se o produto está presente no carrinho
        assertTrue(driver.findElement(By.cssSelector(".cart_description .product-name a")).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
