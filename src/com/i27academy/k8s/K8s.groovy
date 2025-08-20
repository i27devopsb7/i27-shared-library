// groovy code for k8s implementation

package com.i27academy.k8s;
class K8s {
    def jenkins

    K8s(jenkins){
        this.jenkins = jenkins
    }
    // this method will immplement logic to connect to gke clusters
    def auth_login(clusterName, zone, projectID){
        jenkins.sh """
            echo "************** Entering into k8s authentication method ************************"
            gcloud container clusters get-credentials $clusterName --zone $zone --project $projectID
            kubectl get nodes
            kubectl get ns
        """
    }


    // Method to deploy applications
    def k8sdeploy(){
        jenkins.sh """
            echo "Deploying to k8s cluster"
            ls -la
            ls -la .cicd
        """
    }
}

