## **GitOps-Multi-CI-Microservices**

🚀 **A Modern DevOps Project Showcasing GitOps, Multi-CI Pipelines, and Microservices Architecture**

This project demonstrates the implementation of a **cloud-native e-commerce system** using **microservices architecture**, **GitOps principles**, and **multiple CI/CD tools**. It highlights best practices in DevOps, including:

- **GitOps-driven deployments** with ArgoCD.
- **Multi-CI pipelines** using Jenkins, GitLab CI, and GitHub Actions.
- **Containerization** with Docker.
- **Orchestration** with Kubernetes.
- **Monitoring and logging** with Prometheus, Grafana, and Loki.

---

### **Key Features**

- **Microservices**:

  - **Product Service**: Manages product information (Python, Flask).
  - **Order Service**: Handles order creation and management (Java, Spring Boot).
  - **User Service**: Manages user authentication and profiles (Node.js, Express).
  - **Payment Service**: Processes payments (Go, Gin).

- **CI/CD Pipelines**:

  - **Jenkins**: CI pipeline for the Order Service.
  - **GitLab CI**: CI pipeline for the User Service.
  - **GitHub Actions**: CI pipelines for the Product and Payment Services.

- **GitOps with ArgoCD**:

  - Automated deployment and synchronization of Kubernetes manifests.
  - Declarative infrastructure as code (IaC).

- **Kubernetes**:

  - Deployment of microservices in a Kubernetes cluster.
  - Use of Nginx Ingress Controller for routing and load balancing.

- **Monitoring and Logging**:
  - Prometheus and Grafana for monitoring.
  - Loki for centralized logging.

---

### **How to Run**

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/jerryben/GitOps-Multi-CI-Microservices.git
   ```

2. **Set Up Kubernetes**:

   - Install ArgoCD in your Kubernetes cluster.
   - Apply the Kubernetes manifests in the `kubernetes-manifests` directory.

3. **Run CI Pipelines**:

   - Jenkins: For the Order Service.
   - GitLab CI: For the User Service.
   - GitHub Actions: For the Product and Payment Services.

4. **Access the Services**:
   - Use the Nginx Ingress Controller to access the microservices:
     - **Product Service**: `http://your-domain.com/products`
     - **Order Service**: `http://your-domain.com/orders`
     - **User Service**: `http://your-domain.com/users`
     - **Payment Service**: `http://your-domain.com/payments`

---

### **Technologies Used**

- **Languages**: Python, Java, Node.js, Go.
- **Frameworks**: Flask, Spring Boot, Express, Gin.
- **CI/CD Tools**: Jenkins, GitLab CI, GitHub Actions.
- **Containerization**: Docker.
- **Orchestration**: Kubernetes, ArgoCD.
- **Monitoring**: Prometheus, Grafana.
- **Logging**: Loki.

---

### **Why This Project?**

This project is a **comprehensive demonstration of modern DevOps practices**, including:

- **GitOps**: Automating deployments using Git as the source of truth.
- **Multi-CI Pipelines**: Showcasing expertise in multiple CI tools.
- **Microservices Architecture**: Building scalable and maintainable systems.
- **Cloud-Native Technologies**: Using Kubernetes, Docker, and monitoring tools.

---

### **Repository Structure**

```
GitOps-Multi-CI-Microservices/
│
├── product-service/          # Python (Flask)
│   ├── .github/workflows/
│   │   └── product-service-ci.yml
│   ├── app.py
│   ├── Dockerfile
│   └── README.md
│
├── order-service/            # Java (Spring Boot)
│   ├── Jenkinsfile
│   ├── src/
│   ├── Dockerfile
│   └── README.md
│
├── user-service/             # Node.js (Express)
│   ├── .gitlab-ci.yml        # GitLab CI pipeline
│   ├── app.js
│   ├── Dockerfile
│   └── README.md
│
├── payment-service/          # Go (Gin)
│   ├── .github/workflows/
│   │   └── payment-service-ci.yml
│   ├── main.go
│   ├── Dockerfile
│   └── README.md
│
├── kubernetes-manifests/     # Kubernetes manifests
│   ├── product-service.yaml
│   ├── order-service.yaml
│   ├── user-service.yaml
│   ├── payment-service.yaml
│   ├── ingress.yaml
│   └── service-monitors/
│       ├── product-service-monitor.yaml
│       ├── order-service-monitor.yaml
│       ├── user-service-monitor.yaml
│       └── payment-service-monitor.yaml
│
│
├── monitoring/
│   ├── prometheus-values.yaml
│   └── loki-values.yaml
│
├── docker-compose.yml        # Docker Compose for local testing
└── README.md                 # Project overview
```

---

### **Overview of the Deployment Process**

1. **CI Pipelines**:

   - Each microservice has its own CI pipeline (Jenkins, GitLab CI, GitHub Actions).
   - The pipelines build Docker images and push them to a container registry (e.g., Docker Hub).

2. **Kubernetes Manifests**:

   - Each microservice has its own Kubernetes manifest (Deployment, Service, etc.).
   - These manifests are stored in a Git repository (e.g., GitHub).

3. **ArgoCD**:

   - ArgoCD syncs the Kubernetes manifests from the Git repository to the Kubernetes cluster.
   - All microservices are deployed to Kubernetes, not just the Order Service.

4. **Nginx Ingress Controller**:
   - Nginx is used as a reverse proxy/load balancer to expose the microservices externally.
   - It routes traffic to the appropriate microservice based on the URL path.

---

### **Detailed Steps**

#### **Step 1: Build and Push Docker Images**

Each microservice has its own CI pipeline to build and push Docker images. Here’s a recap:

1. **Product Service (Python)**:

   - CI Tool: GitHub Actions.
   - Pipeline File: `.github/workflows/product-service-ci.yml`.
   - Image: `your-dockerhub-username/product-service:latest`.

2. **Order Service (Java)**:

   - CI Tool: Jenkins.
   - Pipeline File: `order-service/Jenkinsfile`.
   - Image: `your-dockerhub-username/order-service:latest`.

3. **User Service (Node.js)**:

   - CI Tool: GitLab CI.
   - Pipeline File: `user-service/.gitlab-ci.yml`.
   - Image: `your-dockerhub-username/user-service:latest`.

4. **Payment Service (Go)**:
   - CI Tool: GitHub Actions.
   - Pipeline File: `.github/workflows/payment-service-ci.yml`.
   - Image: `your-dockerhub-username/payment-service:latest`.

---

#### **Step 2: Define Kubernetes Manifests**

Create Kubernetes manifests for **all microservices** and store them in a Git repository.

---

#### **Step 3: Set Up Nginx Ingress Controller**

1. **Install Nginx Ingress Controller**:
   Install the Nginx Ingress Controller in your Kubernetes cluster:

   ```bash
   kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.5.1/deploy/static/provider/cloud/deploy.yaml
   ```

2. **Create an Ingress Resource**:
   Define an Ingress resource to route traffic to the microservices:

3. **Apply the Ingress Resource**:
   Apply the Ingress resource to your cluster:
   ```bash
   kubectl apply -f kubernetes-manifests/ingress.yaml
   ```

---

#### **Step 4: Configure ArgoCD**

1. **Create an ArgoCD Application**:
   Create an ArgoCD application to sync the Kubernetes manifests from your Git repository

2. **Verify Deployment**:
   Check the status of the ArgoCD application in the ArgoCD UI or CLI:
   ```bash
   argocd app get ecommerce-app
   ```

---

### **Contributing**

Contributions are welcome! If you'd like to contribute, please:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request.

---

### **License**

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
