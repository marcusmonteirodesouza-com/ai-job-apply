package com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.controllers.resumes;

import com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.models.Education;
import com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.models.Experience;
import com.marcusmonteirodesouza.aijobapply.apiserver.resumes.v1.services.resumes.ResumesAssistant;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@RestController
@RequestMapping(path = "/v1/resumes")
public class ResumesController {
    private final SpringTemplateEngine templateEngine;

    private final ResumesAssistant resumesAssistant;

    public ResumesController(SpringTemplateEngine templateEngine, ResumesAssistant resumesService) {
        this.templateEngine = templateEngine;
        this.resumesAssistant = resumesService;
    }

    @GetMapping("/generate")
    public String generateResume() {
        var name = "Marcus Vinicius Monteiro de Souza";

        var contactInfo = "marcusmonteirodesouza@gmail.com";

        var location = "Quebec, QC";

        var summary =
                "Team Lead, Fullstack Web Developer, Cloud Architect, Cloud Engineer, AI Engineer";

        var skills =
                Arrays.asList(
                        "Google Cloud",
                        "AWS",
                        "Azure",
                        "Java",
                        "Scala",
                        "Go",
                        "Node.js",
                        "Python",
                        "React",
                        "terraform");

        var experienceList =
                Arrays.asList(
                        new Experience(
                                "Team Lead",
                                "Improving",
                                "Quebec, QC",
                                "October 2021 - Present",
                                Arrays.asList(
                                        "Design and implementation of a AI-powered search solution"
                                                        + " for a major retail company",
                                                "Design and implementation of 3 AI-powered proofs"
                                                    + " of concept (PoCs) for a major government"
                                                    + " client. The first proof of concept was an"
                                                    + " answer extractor for mandatory PDF forms"
                                                    + " that health care industry manufacturers and"
                                                    + " importers are obligated to fill in certain"
                                                    + " circumstances. The second PoC was a"
                                                    + " Document Warehouse capable of extracting"
                                                    + " metadata from scanned documents. The third"
                                                    + " PoC was a redactor service that would"
                                                    + " generate versions of documents with"
                                                    + " sensitive information redacted",
                                        "Design and implementation of a portal for scientists and"
                                            + " engineers to deploy High-Performance computing"
                                            + " clusters on Google Cloud",
                                                "Design and implementation of a Google Cloud"
                                                    + " Landing Zone for a major government client"
                                                    + " in which the central piece of the"
                                                    + " networking design is a set of Palo Alto"
                                                    + " Next Generation Firewalls")),
                        new Experience(
                                "Fullstack Engineer",
                                "INGENO",
                                "Quebec, QC",
                                "February 2020 - October 2021",
                                Arrays.asList(
                                        "Integration of a restaurant solutions platform with"
                                            + " DoorDash and UberEats, which was a requirement for"
                                            + " the company's successful acquisition",
                                        "Lifting and shifting of a scheduling engine of a major"
                                            + " supply chain management solutions client to Azure,"
                                            + " building a web API around it",
                                        "Implementing an IoT platform for LIDAR devices in AWS"
                                                + " using IoT Core")));

        var educationList =
                Arrays.asList(
                        new Education(
                                "B.A. in International Relations",
                                "Universidate de Brasilia",
                                "2011",
                                Arrays.asList(
                                        "International Politics",
                                        "International Law",
                                        "International Organizations",
                                        "Economics",
                                        "Political Economy",
                                        "Political Science")));

        var certifications =
                Arrays.asList(
                        "Google Cloud Professional Cloud Developer",
                        "Google Cloud Professional DevOps Engineer");

        var jobTitleApplyingFor = "Senior Full Stack Engineer";

        var companyName = "Yelp";

        var jobDescription =
                """
About the job
Summary

Yelp engineering culture is driven by our values: we’re a cooperative team that values individual authenticity and encourages creative solutions to problems. All new engineers deploy working code their first week, and we strive to broaden individual impact with support from managers, mentors, and teams. At the end of the day, we’re all about helping our users, growing as engineers, and having fun in a collaborative environment.

At Yelp, our Full Stack Engineers are the driving force behind every product development stage. You'll have the opportunity to build innovative features and applications that make Yelp the go-to platform for discovering and supporting local businesses. Our mission is to deliver an exceptional user experience, and our engineers dive deep into every layer of the web stack to bring this vision to life. If you're passionate about creating meaningful technology and want to see your work make a real difference, we want you on our team!

On the Growth - User Engagement team, you will design, build, and evolve solutions to acquire, activate, and engage Yelp users. You will work on a cross-platform, distributed team that creates seamless user experiences, develops highly performant backend APIs, and modernizes our platform infrastructure. You will collaborate closely with multiple Engineering, Product, Legal, Design, and Marketing teams to provide high-quality solutions.

This opportunity is fully remote and does not require you to be located in any particular area in Canada. We welcome applicants from throughout Canada. We’d love to have you apply, even if you don’t feel you meet every single requirement in this posting. At Yelp, we’re looking for great people, not just those who simply check off all the boxes.

What You'll Do

Architect and lead the implementation of highly reliable and easy-to-understand product features.
Collaborate with cross-functional partners to shape our product and technical roadmaps.
Deploy projects in a service-oriented architecture, all the way from backend services to fully-featured UIs.
Run A/B experiments and dive into the resulting data to look for trends.
Mentor other engineers and share the skills you’ve learned.

What It Takes To Succeed

Ideally 4+ years of working experience in full-stack web development.
Deep understanding of at least one popular server-side web framework (Django, Flask, Rails, Pyramid, Laravel, Express, etc.). and a modern JS frontend framework (React, Angular, Vue, Ember, etc.).
Proven ability to lead large projects involving multiple people in a highly collaborative, asynchronous, and distributed environment.
Experience leading or contributing to technical roadmaps.
Experience mentoring other engineers.

What You'll Get

Compensation range is $82,000-230,000 annually. Depending on your role and level, you may also be offered a bonus, restricted stock units, and benefits.
This opportunity has the option to be fully remote in all locations across Canada.
You can find more information about Yelp's five star benefits here!

Closing

At Yelp, we believe that diversity is an expression of all the unique characteristics that make us human: race, age, sexual orientation, gender identity, religion, disability, and education — and those are just a few. We recognize that diverse backgrounds and perspectives strengthen our teams and our product. The foundation of our diversity efforts are closely tied to our core values, which include “Playing Well With Others” and “Authenticity.”

We’re proud to be an equal opportunity employer and consider qualified applicants without regard to race, color, religion, sex, national origin, ancestry, age, genetic information, sexual orientation, gender identity, marital or family status, veteran status, medical condition, disability, or any other protected status.

We are committed to providing reasonable accommodations for individuals with disabilities in our job application process. If you need assistance or an accommodation due to a disability, you may contact us at accommodations-recruiting@yelp.com or 1-415-969-8488.

Note: Yelp does not accept agency resumes. Please do not forward resumes to any recruiting alias or employee. Yelp is not responsible for any fees related to unsolicited resumes.

Recruiting and Applicant Privacy Notice
""";

        var companyValues =
                """
About Yelp Engineering
Our work is driven by our values. We’re a cooperative team who prioritizes individual authenticity and encourages innovative solutions to problems. As a newly hired engineer, you’ll be enabled to contribute to the product your very first week on the team. With the support of your mentors, managers, and teammates, your impact only grows from there. At the end of the day, we’re all about advocating for our users, growing as people, and having fun in a collaborative environment.

We're committed to building & scaling products that help our users make more informed decisions on anything from planning a date night to fixing a leaky pipe. You can keep tabs on our work here.
Why Yelp Engineering?
​​​​​​​
We Play Well With Others
We encourage autonomy balanced with teamwork and support, and enjoy the time we spend together helping one another grow. Whether you’re a new Yelper or tenured member of the team, you’ll have the chance to both learn from and teach your peers in a friendly, collaborative environment.

We’re Not Satisfied With Status Quo
At Yelp, you will be empowered to solve novel, impactful, and challenging problems, all while researching new technologies and making improvements across the organization. We develop real solutions for real businesses, and love to give back and open source our work.

We Embrace Authenticity
We strive to create the best work environment possible and do so by bringing our authentic selves to work. We encourage our employees to be who they are, and we cultivate a sense of belonging through employee resource and affinity groups like Awesome Women in Engineering, Colorcoded, DiverseBurst, and many more.

We Care About Our Users
We create tools, products, and features that help local communities, and we care deeply about doing this in a way that is inclusive to all. We’ve taken an active role in protecting consumers by offering restaurant health scores and hospital statistics, and helping business owners acknowledge that they’re open to all.
""";

        var context = new Context();
        context.setVariable("name", name);
        context.setVariable("contactInfo", contactInfo);
        context.setVariable("location", location);
        context.setVariable("summary", summary);
        context.setVariable("skills", skills);
        context.setVariable("experienceList", experienceList);
        context.setVariable("educationList", educationList);
        context.setVariable("certifications", certifications);
        context.setVariable("jobTitleApplyingFor", jobTitleApplyingFor);
        context.setVariable("companyName", companyName);
        context.setVariable("jobDescription", jobDescription);
        context.setVariable("companyValues", companyValues);

        var resumeHtml = templateEngine.process("resume", context);

        System.out.println(resumeHtml);

        var generatedResume = resumesAssistant.chat(resumeHtml);

        return generatedResume;
    }
}
