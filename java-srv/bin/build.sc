import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
ivy"org.springframework.boot:spring-boot-starter-thymeleaf:2.4.2",
ivy"org.springframework.boot:spring-boot-starter-data-solr:2.4.2",
ivy"org.projectlombok:lombok:1.18.8"
  )
}
