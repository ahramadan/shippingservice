# cluster information
 kubectl cluster-info
 kubectl get-all
 kubectl get no

# create depoyment resource
 kubectl create deployment spring-boot-demo --image=abushan/spring-boot-demo --dry-run=client -o=yaml > deployment.yaml
 kubectl create service clusterip spring-boot-demo --tcp=8080:8080 --dry-run -o=yaml >> service.yaml

# deploy the configuration to the cluster
kubectl apply -f ./kube

# check the created pods
kubectl get all

# forward the port to check if the pod is running for developemnt only.
kubectl port-forward svc/spring-boot-demo 8080:8080
# invoke the health endpoint to verify its running
curl localhost:8080/actuator/health