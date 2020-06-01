import React from "react";
import { Switch, Route, Redirect } from "react-router-dom";
// creates a beautiful scrollbar
import PerfectScrollbar from "perfect-scrollbar";
import "perfect-scrollbar/css/perfect-scrollbar.css";
// @material-ui/core components
import { makeStyles } from "@material-ui/core/styles";
import Button from "components/CustomButtons/Button.js";
import Card from "components/Card/Card.js";
import CardHeader from "components/Card/CardHeader.js";
import CardAvatar from "components/Card/CardAvatar.js";
import CardBody from "components/Card/CardBody.js";
import CardFooter from "components/Card/CardFooter.js";
import Parallax from "components/Parallax/Parallax.js";
import routes from "routes.js";

import styles from "assets/jss/material-dashboard-react/layouts/loginStyle.js";
import SectionLogin from "./Sections/SectionLogin.js";

import bgImage from "assets/img/sidebar-2.jpg";
import background from "assets/img/cook.png";
import GridContainer from "components/Grid/GridContainer.js";
import GridItem from "components/Grid/GridItem.js";
import avatar from "assets/img/faces/marc.jpg";
  
let ps;

const useStyles = makeStyles(styles);

export default function Login() {
    const classes = useStyles();
    const mainPanel = React.createRef();

    return (
        <SectionLogin/>
    )
}