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
    
}




Also:   org.jenkinsci.plugins.workflow.actions.ErrorAction$ErrorId: 487e8a6c-990d-40a4-975c-baf29f6fd184
org.jenkinsci.plugins.workflow.cps.CpsCompilationErrorsException: startup failed:
file:/var/lib/jenkins/jobs/i27-eureka/branches/master/builds/42/libs/adc045f5b6dfacb777b92a8156e33c78746c317bccaae4b66f12ea0779e4998d/src/com/i27academy/k8s/K8s.groovy: 5: Invalid duplicate class definition of class com.i27academy.k8s.K8s : The source file:/var/lib/jenkins/jobs/i27-eureka/branches/master/builds/42/libs/adc045f5b6dfacb777b92a8156e33c78746c317bccaae4b66f12ea0779e4998d/src/com/i27academy/k8s/K8s.groovy contains at least two definitions of the class com.i27academy.k8s.K8s.
One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name. Solutions are to change the file name or to change the class name.
 @ line 5, column 1.
   class K8s{
   ^

1 error