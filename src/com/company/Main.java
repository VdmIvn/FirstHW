package com.company;

import Course.Course;
import Course.Riding;
import Course.Running;
import Course.Swimming;
import Team.Team;
import Team.TeamMember;

public class Main {

    public static void main(String[] args) {


            Team newTeam = new Team("New team",
                    new TeamMember("A", 6),
                    new TeamMember("B", 6),
                    new TeamMember("C", 6),
                    new TeamMember("D", 7));

            Course course = new Course(new Running(5), new Swimming(7), new Riding(3));
            course.doIt(newTeam);
        }
    }

