<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
</head>
<body>

  <h1>ECommerce Website – Automation Testing Framework</h1>

  <p>This project is a <strong>Cucumber + Selenium + Java + Maven</strong> automation framework built for testing the 
  <a href="https://automationexercise.com/">Automation Exercise Website</a>.  
  It follows the <strong>Page Object Model (POM)</strong> design pattern for better readability, reusability, and maintainability.</p>

  <h2>📂 Project Structure</h2>
  <pre>
CucumberPOMSeries
│── src
│   ├── main/java/com
│   │   ├── factory           # Driver Factory (WebDriver initialization, config mgmt)
│   │   ├── pages             # Page classes (CartPage, LoginPage, etc.)
│   │   └── utilities         # Utility classes (helpers, constants, etc.)
│   │
│   ├── test/java
│   │   ├── applicationHooks  # Hooks (Before/After scenario setup)
│   │   ├── stepdefinitions   # Step Definitions for feature files
│   │   └── testRunners       # Test runner classes (Cucumber JUnit/TestNG runners)
│   │
│   ├── test/resources
│       ├── com/features      # Feature files (Cart.feature, Login.feature, etc.)
│       └── config            # Config & reporting files
│
│── target/                   # Compiled test output
│── test-output/              # Reports
│── pom.xml                   # Maven dependencies & plugins
│── README.md                 # Project documentation
  </pre>

  <h2>⚙️ Tools & Technologies</h2>
  <ul>
    <li><strong>Java</strong> (programming language)</li>
    <li><strong>Selenium WebDriver</strong> (UI automation)</li>
    <li><strong>Cucumber (BDD)</strong></li>
    <li><strong>JUnit/TestNG</strong> (test runner)</li>
    <li><strong>Maven</strong> (build & dependency management)</li>
    <li><strong>Extent Reports</strong> (test reporting)</li>
  </ul>

  <h2>🚀 Features Automated</h2>
  <ul>
    <li>✅ User Login / Logout</li>
    <li>✅ Product Search & Navigation</li>
    <li>✅ Add to Cart & Checkout</li>
    <li>✅ Payment Workflow</li>
    <li>✅ Order History & Verification</li>
  </ul>

  <h2>🏗️ How to Set Up</h2>
  <ol>
    <li>Clone the repo:
      <pre>git clone https://github.com/Vikas-Chaurasia-9252/AutomationPracticeWebsiteCucumberProject.git
cd CucumberPOMSeries</pre>
    </li>
    <li>Install dependencies:
      <pre>mvn clean install</pre>
    </li>
    <li>Run tests with Maven:
      <pre>mvn test</pre>
    </li>
    <li>Run specific feature file:
      <pre>@CucumberOptions(features = "src/test/resources/com/features/Login.feature")</pre>
    </li>
  </ol>

  <h2>📊 Reports</h2>
  <p>After execution, reports are generated under:</p>
  <pre>
test-output/
target/extent-reports/
  </pre>
  <p>Includes <strong>Extent Reports</strong> and <strong>JUnit reports</strong>.</p>

  <h2>🧩 Folder Responsibilities</h2>
  <ul>
    <li><strong>pages/</strong> → Page Object Model classes for each page</li>
    <li><strong>stepdefinitions/</strong> → Glue code linking feature steps to Java methods</li>
    <li><strong>applicationHooks/</strong> → Hooks for pre/post scenario actions (driver setup/teardown)</li>
    <li><strong>testRunners/</strong> → Runner classes with Cucumber Options</li>
    <li><strong>resources/features/</strong> → Gherkin Feature files</li>
    <li><strong>config/</strong> → Properties & reporting configuration</li>
  </ul>

  <h2>📌 Best Practices Followed</h2>
  <ul>
    <li>Page Object Model (POM)</li>
    <li>Reusable utility methods</li>
    <li>Cucumber BDD with readable scenarios</li>
    <li>Separate runner classes for modular execution</li>
    <li>Configurable test data through <code>cucumber.properties</code></li>
  </ul>

  <h2>👤 Author</h2>
  <p>
    <strong>Vikas Chourasia</strong><br>
    <strong>Role:</strong> QA Automation Engineer<br>
    <strong>Email:</strong> vcvikaschaurasia@gmail.com
  </p>

</body>
</html>
