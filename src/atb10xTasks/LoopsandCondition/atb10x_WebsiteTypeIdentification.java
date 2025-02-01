package atb10xTasks.LoopsandCondition;

import java.util.Scanner;

public class atb10x_WebsiteTypeIdentification {

/*TODO: Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
:- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = sc.nextLine().toLowerCase().trim();
        sc.close();


        if(url.endsWith(".xyz")){
            System.out.println("The website type is: Unknown or other types of websites");
        }else  if(url.endsWith(".info")){
            System.out.println("The website type is: Informational website");
        }else  if(url.endsWith(".net")){
            System.out.println("The website type is: Network-related website");
        }else  if(url.endsWith(".gov")){
            System.out.println("The website type is:  Government website");
        }else  if(url.endsWith(".edu")){
            System.out.println("The website type is: Educational institution");
        }else  if(url.endsWith(".org")){
            System.out.println("The website type is: Non-profit organization");
        }else if(url.endsWith(".com")){
            System.out.println("The website type is: Commercial website");
        }else {
            System.out.println(" You have entered and invalid url, Please ensure URL has right domain");

            
        }

    }
}
