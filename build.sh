npm install @angular-devkit/build-angular
ng build --configuration=production
mvn clean package

gcloud builds submit --tag southamerica-west1-docker.pkg.dev/springboot-angular-sample/springboot-angular-sample/springboot-angular-sample

gcloud run deploy springboot-angular-sample \
  --image southamerica-west1-docker.pkg.dev/springboot-angular-sample/springboot-angular-sample/springboot-angular-sample \
  --platform managed \
  --region southamerica-west1 \
  --allow-unauthenticated \