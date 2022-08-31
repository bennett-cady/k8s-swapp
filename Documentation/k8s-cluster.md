1.  Create an EC2 instance using AWS's website
    1. Go to AWS’s website. In the search bar, search for EC2, click on Launch Instance
    2. Fill out the form with the following information:
        * AMI-Amazon Linux 2, Storage: 100 Gi
        * Instance Type: t3.2xlarge
        * Availability Zone: us-east-1
        * Add tag: Key= name, values= <choose name for instance>
        * Create a new key pair: choose ".pem file", give a name to the .pem file. This .pem file will be saved in your downloads, you will use it to access the EC2
  3. Launch the instance
2.  Connect to the EC2 and install the necesssary tools
3. Configure the cluster
4.  Install the ingresses

  
