<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>MakeWish | Mágico dos Sonhos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="stilearning">

    <meta http-equiv="x-pjax-version" content="v173">

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!-- fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/favico-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/favico-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/favico-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="ico/favico-57-precomposed.png">
    <link rel="shortcut icon" href="ico/favico.png">
    <link rel="shortcut icon" href="ico/favico.ico">

    <!-- build:css styles/vendor.css -->
    <!-- bower:css -->
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
    <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="bower_components/animate.css/animate.css">
    <link rel="stylesheet" href="bower_components/Hover/css/hover.css">
    <!-- endbower -->
    <!-- endbuild -->

    <!-- build:css(.tmp) styles/main.css -->
    <link id="style-components" href="styles/loaders.css" rel="stylesheet">
    <link id="style-components" href="styles/bootstrap-theme.css" rel="stylesheet">
    <link id="style-components" href="styles/dependencies.css" rel="stylesheet">
    <link id="style-base" href="styles/stilearn.css" rel="stylesheet">
    <link id="style-responsive" href="styles/stilearn-responsive.css" rel="stylesheet">
    <link id="style-helper" href="styles/helper.css" rel="stylesheet">
    <link id="style-sample" href="styles/pages-style.css" rel="stylesheet">
    <!-- endbuild -->

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
          <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7/html5shiv.min.js"></script>
        <![endif]-->
</head>

<body class="animated fadeIn">
    <!-- section header -->
    <header class="header">
        <!-- header brand -->
        <div class="header-brand">
            <i class "fa fa-magic" style="float:left;font-size:18px;line-height:240px;"></i>
            <a href="index.html" class="brand-logo pull-left" style="font-size:18px;">               
                Mágico de Sonhos
            </a>
        </div>
        <!-- header brand -->

        <!-- header-profile -->
        <div class="header-profile">
            <div class="profile-nav">
                <span class="profile-username">Mesa3</span>
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="fa fa-angle-down"></span>
                </a>
                <ul class="dropdown-menu animated flipInX pull-right" role="menu">
                    <li><a href="#"><i class="fa fa-user"></i> Mesa</a>
                    </li>
                    <li><a href="#"><i class="fa fa-envelope"></i> Inbox</a>
                    </li>
                    <li><a href="#"><i class="fa fa-tasks"></i> Tasks</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="fa fa-sign-out"></i> Log Out</a>
                    </li>
                </ul>
            </div>
            <div class="profile-picture">
                <a data-toggle="side-right" href="#"> <img alt="me" src="images/dummy/profile.jpg"></a>
            </div>
        </div>
        <!-- header-profile -->


        <!-- header menu -->
        <ul class="hidden-xs header-menu pull-right">
            <li>
                <a href="#" title="View site">
                    <i class="header-menu-icon icon-only fa fa-rocket"></i>
                </a>
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Notifications" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    <span class="badge badge-success">4</span>
                    <i class="header-menu-icon icon-only fa fa-warning"></i>
                </a>
                <ul class="dropdown-menu dropdown-extend animated fadeInDown pull-right" role="menu">
                    <li class="dropdown-header">Notifications</li>
                    <!-- /dropdown-header -->
                    <li class="notif-minimal" data-toggle="niceScroll" data-scroll-cursorcolor="#ecf0f1">
                        <a class="notif-item" href="#">
                            <div class="notif-ico bg-primary">
                                <i class="fa fa-heart-o"></i>
                            </div>
                            <p class="notif-text">
                                <span class="text-bold">Evelyn</span>favorite your Post</p>
                        </a>
                    </li>
                    <!-- /dropdown-alert -->
                    <li class="dropdown-footer bg-cloud">
                        <a class="view-all" tabindex="-1" href="#">
                            <i class="fa fa-angle-right pull-right"></i> See all notifications
                        </a>
                    </li>
                    <!-- /dropdown-footer -->
                </ul>
                <!-- /dropdown-extend -->
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Inboxs" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    <span class="badge badge-warning animated animated-repeat flash">3</span>
                    <i class="header-menu-icon icon-only fa fa-envelope-o"></i>
                </a>
                <ul class="dropdown-menu dropdown-extend animated fadeInDown pull-right" role="menu">
                    <li class="dropdown-header">You have 3 new messages</li>
                    <!-- /dropdown-header -->
                    <li class="notif-media" data-toggle="niceScroll" data-scroll-cursorcolor="#ecf0f1">
                        <a class="notif-item" href="#">
                            <div class="notif-img pull-left">
                                <img src="images/dummy/uifaces21.jpg" alt="" class="img-circle" />
                            </div>
                            <h3 class="notif-heading">Account Team
                                <small>58 min</small>
                            </h3>
                            <p class="notif-text">Spread the Word & Earn!</p>
                        </a>
                        <!-- /notif-item -->
                        <a class="notif-item" href="#">
                            <div class="notif-img pull-left">
                                <img src="images/dummy/uifaces5.jpg" alt="" class="img-circle" />
                            </div>
                            <h3 class="notif-heading">Timothy Lucas, Me (2)
                                <small>Wed</small>
                            </h3>
                            <p class="notif-text">Elit odio, sed leo ligula semper, vehicula maecenas, eros fusce</p>
                        </a>                                                
                        <!-- /notif-item -->
                    </li>
                    <!-- /dropdown-alert -->
                    <li class="dropdown-footer bg-cloud">
                        <a class="view-all" tabindex="-1" href="#">
                            <i class="fa fa-angle-right pull-right"></i> See all messages
                        </a>
                    </li>
                    <!-- /dropdown-footer -->
                </ul>
                <!-- /dropdown-extend -->
            </li>
            <!-- /header-menu-item -->
            <li>
                <a href="#" title="Tasks" class="dropdown-toggle" data-toggle="dropdown" role="button">
                    <span class="badge badge-danger">7</span>
                    <i class="header-menu-icon icon-only fa fa-tasks"></i>
                </a>
                <ul class="dropdown-menu dropdown-extend animated fadeInDown pull-right" role="menu">
                    <li class="dropdown-header">Tasks progress</li>
                    <!-- /dropdown-header -->
                    <li class="notif-progress" data-toggle="niceScroll" data-scroll-cursorcolor="#ecf0f1">
                        <a class="notif-item" href="#">
                            <div class="notif-text pull-right">60%</div>
                            <div class="notif-text">Uploading...</div>
                            <div class="progress progress-sm">
                                <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                    <span class="sr-only">60% Complete</span>
                                </div>
                            </div>
                        </a>
                        <!-- /notif-item -->
                        <a class="notif-item" href="#">
                            <div class="notif-text pull-right">33%</div>
                            <div class="notif-text">Upgrade Theme</div>
                            <div class="progress progress-sm">
                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100" style="width: 33%;">
                                    <span class="sr-only">33% Complete</span>
                                </div>
                            </div>
                        </a>                                                
                        <!-- /notif-item -->
                    </li>
                    <!-- /dropdown-alert -->
                    <li class="dropdown-footer bg-cloud">
                        <a class="view-all" tabindex="-1" href="#">
                            <i class="fa fa-angle-right pull-right"></i> See all Tasks
                        </a>
                    </li>
                    <!-- /dropdown-footer -->
                </ul>
                <!-- /dropdown-extend -->
            </li>
            <!-- /header-menu-item -->
        </ul>
        <!--/header-menu pull-right-->
    </header>
    <!--/header-->


    <!-- sidebar content section -->
    <section class="section">
        <!-- DONT FORGET REPLACE IT FOR PRODUCTION! -->
        <aside class="side-left">
            <ul class="sidebar">
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">30</div>
                        <i class="sidebar-icon fa fa-th-large"></i>
                        <span class="sidebar-text">Todos</span>
                    </a>
                </li>
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">30</div>
                        <i class="sidebar-icon fa fa-th-large"></i>
                        <span class="sidebar-text">Viagem</span>
                    </a>
                </li>
                <li>
                    <a href="index.php" data-pjax=".content-body">
                        <div class="badge badge-primary animated animated-repeat wobble">30</div>
                        <i class="sidebar-icon fa fa-th-large"></i>
                        <span class="sidebar-text">Gourmet</span>
                    </a>
                </li>
            </ul>
            <!--/sidebar-->
        </aside>
        <!--/side-left-->

        <div class="content">
            <!-- <div class="content-header">
                <div class="content-header-extra">
                    <a class="item-ch-extra" href="#">
                        <span class="sparkline-bar" data-height="36px" data-barWidth="3" data-barColor="#5BB75B" data-value="0,5,3,9,6,5,9,7,3,5,2"></span>
                        <div class="data-text text-success">
                            765K
                            <p class="text-muted">Visits</p>
                        </div>
                    </a>
                    <!--/item-ch-extra

                    <!--<div class="divider"></div>                    
                </div>-->
                <!--/content-header-extra -->

                <!--<h2 class="content-title"><i class="fa fa-home"></i> Welcome to Stilearn 2.0</h2>
            </div> -->
            <!--/content-header -->

            <div class="content-body">
                <!-- Product Session -->
                <div id="error-placement2"></div>
                <h3 class="lead"><i class="fa fa-flask"></i> Ingredientes do Sonho</h3>
                <div class="row">
                    <div class="col-md-4">
                        <div id="contentfeeds1" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds1" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds1" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="no-padding jumbotron bg-inverse">
                                    <div class="tile">
                                        <div class="img-wrapper">
                                            <img class="lazy" data-original="images/dummy/img2.png" alt="">
                                        </div>
                                    </div>

                                    <div class="jumbotron-text">
                                        <p class="lead">Show do Luan Santana</p>
                                        <p class="clearfix">
                                            <span class="pull-right">
                                                <a href="#" class="btn btn-xs btn-inverse btn-rounded">#luanstana</a>
                                                <a href="#" class="btn btn-xs btn-inverse btn-rounded">#make-a-wish</a>
                                            </span>
                                        </p>
                                    </div>
                                </div>
                                <!--/jumbotron-->

                                <div class="profile-line clearfix">
                                    <!-- <img class="img-circle pull-left" src="images/dummy/uifaces14.jpg" alt="uifaces14" width="46px" width="46px" /> -->
                                    <div class="text-14">
                                    	<i class="fa fa-ticket"></i>
                                        <strong>Ingresso Luan Santana</strong>
                                    </div>                                    
                                </div>
                                <!--/profile-line-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 21 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 16</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Nome do Comprador" />
                                        <span class="input-group-btn">
                                            <button class="btn btn-transparent text-muted btn-file" type="button">
                                                <i class="fa fa-user"></i>                                                
                                            </button>

                                        </span>
                                    </div>
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Código do Vendedor" />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-lock"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="Senha" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                    <div style="margin-top:10px; text-align:center;">
                                        <button class="btn btn-primary">Faça Acontecer</button>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->



                        <div id="contentfeeds4" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds4" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds4" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="no-padding jumbotron bg-primary">
                                    <p class="lead">The 20 best Google Chrome extensions for web designers</p>
                                    <p class="clearfix">
                                        <span class="pull-right">
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#chrome</a>
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#tools</a>
                                        </span>
                                    </p>
                                </div>
                                <!--/jumbotron-->

                                <div class="profile-line clearfix">
                                    <img class="img-circle pull-left" src="images/dummy/uifaces11.jpg" alt="uifaces11" width="46px" width="46px" />
                                    <div class="text-14">
                                        <strong>Samantha Jenkins</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>Share Public Post - Yesterday</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 34 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 51</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="pull-left margin-right">
                                        <img class="img-circle" src="images/dummy/profile.jpg" alt="profile" width="36px" width="36px" />
                                    </div>
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Write a comment..." />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-camera"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="remove file attach" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->
                    </div>
                    <!--/cols-->


                    <div class="col-md-4">
                        <div id="contentfeeds2" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds2" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds2" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="profile-line clearfix">
                                    <img class="img-circle pull-left" src="images/dummy/uifaces19.jpg" alt="uifaces19" width="46px" width="46px" />
                                    <div class="text-14">
                                        <strong>Phillip Morrison</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>Share Exclusive Post - 7:16 AM</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <div class="no-padding jumbotron bg-primary">
                                    <p class="lead">Times Designers Are Monitoring Reaction to the Redesign, With Adjustments Possible</p>
                                    <p class="clearfix">
                                        <span class="pull-right">
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#manage</a>
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#workFlow</a>
                                        </span>
                                    </p>
                                </div>
                                <!--/jumbotron-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 47 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 98</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Write a comment..." />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-camera"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="remove file attach" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->

                        <div id="contentfeeds5" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds5" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds5" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="no-padding jumbotron bg-inverse">
                                    <p class="lead">COMPRESSED DATA; Homing In on 'Intelligent' Web Design</p>
                                    <p class="clearfix">
                                        <span class="pull-right">
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#webDesign</a>
                                        </span>
                                    </p>
                                </div>
                                <!--/jumbotron-->

                                <div class="profile-line clearfix">
                                    <img class="img-circle pull-left" src="images/dummy/uifaces3.jpg" alt="uifaces3" width="46px" width="46px" />
                                    <div class="text-14">
                                        <strong>Aaron James</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>Share Public Post - Yesterday</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 28 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 31</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Write a comment..." />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-camera"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="remove file attach" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->
                    </div>
                    <!--/cols-->


                    <div class="col-md-4">
                        <div id="contentfeeds3" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds3" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds3" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="no-padding jumbotron bg-danger">
                                    <p class="lead">Make Your Design Keep Simple and Easy Read</p>
                                    <p class="clearfix">
                                        <span class="pull-right">
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#stilearn</a>
                                            <a href="#" class="btn btn-xs btn-transparent btn-rounded">#clean</a>
                                        </span>
                                    </p>
                                </div>
                                <!--/jumbotron-->

                                <div class="profile-line clearfix">
                                    <img class="img-circle pull-left" src="images/dummy/uifaces3.jpg" alt="uifaces3" width="46px" width="46px" />
                                    <div class="text-14">
                                        <strong>Aaron James</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>Share Public Post - 6:36 AM</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 8 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 12</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="pull-left margin-right">
                                        <img class="img-circle" src="images/dummy/profile.jpg" alt="profile" width="36px" width="36px" />
                                    </div>
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Write a comment..." />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-camera"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="remove file attach" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->


                        <div id="contentfeeds6" class="panel panel-animated panel-default">
                            <div class="panel-actions-fly">
                                <button data-refresh="#contentfeeds6" data-error-place="#error-placement2" title="refresh" class="btn-panel">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <!--/btn-panel-->
                                <button data-close="#contentfeeds6" title="close" class="btn-panel">
                                    <i class="fa fa-times"></i>
                                </button>
                                <!--/btn-panel-->
                            </div>
                            <!--/panel-action-fly-->

                            <div class="panel-body bordered-bottom">
                                <div class="profile-line clearfix">
                                    <img class="img-circle pull-left" src="images/dummy/uifaces21.jpg" alt="uifaces21" width="46px" width="46px" />
                                    <div class="text-14">
                                        <strong>John Doe</strong>
                                    </div>
                                    <div class="text-muted">
                                        <small>Share Exclusive Post - Yesterday</small>
                                    </div>
                                </div>
                                <!--/profile-line-->

                                <div class="no-padding jumbotron bg-warning">
                                    <div class="tile">
                                        <div class="img-wrapper">
                                            <img class="lazy" data-original="images/dummy/img5.png" alt="">
                                        </div>
                                    </div>
                                    <div class="jumbotron-text">
                                        <p class="lead">Technology Tools: Web 2.0 in the Classroom</p>
                                        <p class="clearfix">
                                            <span class="pull-right">
                                                <a href="#" class="btn btn-xs btn-warning btn-rounded">#tools</a>
                                                <a href="#" class="btn btn-xs btn-warning btn-rounded">#technology</a>
                                            </span>
                                        </p>
                                    </div>
                                </div>
                                <!--/jumbotron-->

                                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius, dolores facilis maiores minus itaque excepturi.</p>

                                <p class="text-muted pull-right"><i class="fa fa-comment"></i> 87 &nbsp;&nbsp;&nbsp; <i class="fa fa-heart"></i> 163</p>
                            </div>
                            <!--panel-body-->

                            <div class="panel-body">
                                <form action="" role="form">
                                    <div class="input-group input-group-in">
                                        <input type="text" class="form-control" placeholder="Write a comment..." />
                                        <span class="input-group-btn">
                                            <span class="fileinput fileinput-new" data-provides="fileinput">
                                                <button class="btn btn-transparent text-muted btn-file" type="button">
                                                    <i class="fileinput-new fa fa-camera"></i>
                                                    <input type="file" name="fileinput_inline[]">
                                                </button>
                                                <button class="btn btn-transparent fileinput-exists text-muted" rel="tooltip-bottom" title="remove file attach" data-dismiss="fileinput"><i class="fa fa-times"></i>
                                                </button>
                                            </span>
                                        </span>
                                    </div>
                                </form>
                                <!--/form-->
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->
                    </div>
                    <!--/cols-->
                </div>
                <!--/row-->



                <div id="content-feeds"></div>
                <p class="text-center">
                    <a data-ajax="#content-feeds" data-scripts="data-sample/feeds-content.js" href="data-sample/feeds-content.html" data-max-page="5" data-loading-text="<i class='fa fa-spin fa-spinner'></i> Loading..." class="btn btn-sm btn-cloud">Load more feeds...</a>
                </p>
                <!-- DASHBOARD
                    ================================================== -->
                <!-- Dashboard  -->
                <div id="error-placement"></div>
                <div class="row margin-top">
                    <div class="col-md-12 margin-bottom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#system-stats" data-toggle="tab">System Stats</a>
                            </li>
                            <li><a href="#server-stats" data-toggle="tab">Server Stats</a>
                            </li>
                        </ul>
                    </div>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div id="system-stats" class="tab-pane fade active in">
                            <div class="col-md-4">
                                <div id="overall-visitor" class="panel panel-animated panel-primary bg-primary">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-visitor" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to system stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Visitor</p>
                                        <!--/lead as title-->

                                        <ul class="list-percentages row">
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Monthly</p>
                                                <p class="text-lg">
                                                    <strong>765,298</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Weekly</p>
                                                <p class="text-lg">
                                                    <strong>1,765</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Today</p>
                                                <p class="text-lg">
                                                    <strong>563</strong>
                                                </p>
                                            </li>
                                        </ul>
                                        <!--/list-percentages-->
                                        <p class="helper-block">
                                            <div class="progress progress-xs progress-flat progress-inverse-inverse">
                                                <div class="progress-bar progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                    <span class="sr-only">60% Complete (inverse)</span>
                                                </div>
                                            </div>
                                            <p class="text-ellipsis"><i class="fa fa-caret-up"></i> 654 &nbsp;&nbsp; +21<sup>%</sup> 
                                                <small>Looks Good!, up from last month</small>
                                            </p>
                                        </p>
                                        <!--/help-block-->
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-visitor-->
                            </div>
                            <!--/cols-->

                            <div class="col-md-4">
                                <div id="overall-users" class="panel panel-animated panel-success bg-success">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-users" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to system stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Users</p>
                                        <!--/lead as title-->

                                        <ul class="list-percentages row">
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">All Users</p>
                                                <p class="text-lg">
                                                    <strong>1437</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Last Month</p>
                                                <p class="text-lg">
                                                    <strong>287</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">New Users</p>
                                                <p class="text-lg">
                                                    <strong>87</strong>
                                                </p>
                                            </li>
                                        </ul>
                                        <!--/list-percentages-->
                                        <p class="helper-block">
                                            <div class="progress progress-xs progress-flat progress-inverse-inverse">
                                                <div class="progress-bar progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                    <span class="sr-only">60% Complete (inverse)</span>
                                                </div>
                                            </div>
                                            <p class="text-ellipsis"><i class="fa fa-caret-up"></i> 63 &nbsp;&nbsp; +8<sup>%</sup> 
                                                <small>Looks Good!, up from last month</small>
                                            </p>
                                        </p>
                                        <!--/help-block-->
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-users-->
                            </div>
                            <!--/cols-->

                            <div class="col-md-4">
                                <div id="overall-orders" class="panel panel-animated panel-danger bg-danger">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-orders" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to system stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Orders</p>
                                        <!--/lead as title-->

                                        <ul class="list-percentages row">
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Total Revenue</p>
                                                <p class="text-lg">
                                                    <strong>1,954,452</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Last Month</p>
                                                <p class="text-lg">
                                                    <strong>43,671</strong>
                                                </p>
                                            </li>
                                            <li class="col-xs-4">
                                                <p class="text-ellipsis">Today</p>
                                                <p class="text-lg">
                                                    <strong>1,219</strong>
                                                </p>
                                            </li>
                                        </ul>
                                        <!--/list-percentages-->
                                        <p class="helper-block">
                                            <div class="progress progress-xs progress-flat progress-inverse-inverse">
                                                <div class="progress-bar progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                    <span class="sr-only">60% Complete (inverse)</span>
                                                </div>
                                            </div>
                                            <p class="text-ellipsis"><i class="fa fa-caret-down"></i> 386 &nbsp;&nbsp; -5<sup>%</sup> 
                                                <small>Looks not good! try increasing your product</small>
                                            </p>
                                        </p>
                                        <!--/help-block-->
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-orders-->
                            </div>
                            <!--/cols-->
                        </div>
                        <!--/#system-stats-->


                        <div id="server-stats" class="tab-pane fade">
                            <div class="col-md-4">
                                <div id="overall-bandwidth" class="panel panel-animated panel-primary bg-primary">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-bandwidth" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to server stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Bandwidth</p>
                                        <!--/lead as title-->

                                        <p>
                                            <div class="easyPieChart" data-barColor="#232332" data-trackColor="#ecf0f1" data-scaleColor="#ecf0f1" data-percent="16" data-size="120">
                                                <span>16%</span>
                                            </div>
                                            <p class="text-ellipsis text-center">Bandwidth Usage 120,4 GB / 2 TB</p>
                                        </p>
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-bandwidth-->
                            </div>
                            <!--/cols-->

                            <div class="col-md-4">
                                <div id="overall-diskspace" class="panel panel-animated panel-success bg-success">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-diskspace" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to server stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Disk Space</p>
                                        <!--/lead as title-->

                                        <p>
                                            <div class="easyPieChart" data-barColor="#232332" data-trackColor="#ecf0f1" data-scaleColor="#ecf0f1" data-percent="37" data-size="120">
                                                <span>64%</span>
                                            </div>
                                            <p class="text-ellipsis text-center">File Usage 128,137 / 200,000</p>
                                        </p>
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-diskspace-->
                            </div>
                            <!--/cols-->

                            <div class="col-md-4">
                                <div id="overall-phisicmem" class="panel panel-animated panel-danger bg-danger">
                                    <div class="panel-body">
                                        <div class="panel-actions-fly">
                                            <button data-refresh="#overall-phisicmem" data-error-place="#error-placement" title="refresh" class="btn-panel">
                                                <i class="glyphicon glyphicon-refresh"></i>
                                            </button>
                                            <!--/btn-panel-->
                                            <a href="#" title="Go to server stats page" class="btn-panel">
                                                <i class="glyphicon glyphicon-stats"></i>
                                            </a>
                                            <!--/btn-panel-->
                                        </div>
                                        <!--/panel-action-fly-->

                                        <p class="lead">Physical Memory</p>
                                        <!--/lead as title-->

                                        <p>
                                            <div class="easyPieChart" data-barColor="#232332" data-trackColor="#ecf0f1" data-scaleColor="#ecf0f1" data-percent="45" data-size="120">
                                                <span>45%</span>
                                            </div>
                                            <p class="text-ellipsis text-center">Physical Memory Usage 457 MB / 1 GB</p>
                                        </p>
                                    </div>
                                    <!--/panel-body-->
                                </div>
                                <!--/panel overal-phisicmem-->
                            </div>
                            <!--/cols-->
                        </div>
                        <!--/#system-stats-->
                    </div>
                    <!--/tab-content-->
                </div>
                <!--/row-->





                <div class="row">
                    <div class="col-sm-8">
                        <!-- VMAP -->
                        <div class="panel panel-animated panel-default">
                            <div class="panel-heading bg-white">
                                <div class="panel-actions">
                                    <div class="btn-group">
                                        <button class="btn-panel dropdown-toggle" data-toggle="dropdown">
                                            Change Maps
                                            <i class="fa fa-angle-down"></i>
                                        </button>
                                        <ul id="changeMapRegion" class="dropdown-menu pull-right">
                                            <li class="active"><a href="#" data-map="world_en">World</a>
                                            </li>
                                            <li class="divider"></li>
                                            <li><a href="#" data-map="africa_en">Africa</a>
                                            </li>
                                            <li><a href="#" data-map="asia_en">Asia</a>
                                            </li>
                                            <li><a href="#" data-map="australia_en">Australia</a>
                                            </li>
                                            <li><a href="#" data-map="europe_en">Europe</a>
                                            </li>
                                            <li><a href="#" data-map="north-america_en">North America</a>
                                            </li>
                                            <li><a href="#" data-map="south-america_en">South America</a>
                                            </li>
                                            <li class="divider"></li>
                                            <li><a href="#" data-map="dz_fr">Algeria</a>
                                            </li>
                                            <li><a href="#" data-map="france_fr">France</a>
                                            </li>
                                            <li><a href="#" data-map="germany_en">Germany</a>
                                            </li>
                                            <li><a href="#" data-map="russia_en">Russia</a>
                                            </li>
                                            <li><a href="#" data-map="usa_en">USA</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <!--/btn-group-->
                                </div>
                                <!-- /panel-actions -->
                                <h4 class="panel-title" data-ariginal-title="World Map" id="mapRegion">World Map</h4>
                            </div>
                            <!--/panel-heading-->

                            <div class="panel-body">
                                <div id="vmap" class="vmap" style="height:370px"></div>
                            </div>
                            <!--/panel-body-->

                            <ul class="list-group">
                                <li class="list-group-item" id="legend-region">Summary of World</li>
                                <li class="list-group-item">
                                    <div id="legend-visit" class="badge badge-primary"></div><i class="fa fa-signal"></i> Today Visitor</li>
                                <li class="list-group-item">
                                    <div id="legend-member" class="badge badge-primary"></div><i class="fa fa-users"></i> Members</li>
                                <li class="list-group-item">
                                    <div id="legend-customer" class="badge badge-primary"></div><i class="fa fa-briefcase"></i> Customers</li>
                                <li class="list-group-item">
                                    <div id="legend-online" class="badge badge-primary"></div><i class="fa fa-circle"></i> Online</li>
                                <li class="list-group-item">
                                    <div id="legend-revenue" class="badge badge-primary"></div><i class="fa fa-dollar"></i> Total Revenue</li>
                            </ul>
                            <!--/list-group map-legend-->
                        </div>
                        <!--/panel-->
                    </div>
                    <!--/cols-->


                    <div class="col-sm-4">
                        <div class="panel panel-animated panel-inverse bg-inverse">
                            <div class="panel-body">
                                <p class="text-lg">
                                    <span class="pull-right">64<sup>%</sup>
                                    </span><i class="fa fa-cloud-download"></i> Downloading...</p>
                                <div class="progress progress-lg">
                                    <div class="progress-bar progress-bar-inverse" role="progressbar" aria-valuenow="64" aria-valuemin="0" aria-valuemax="100" style="width: 64%">
                                        <span class="sr-only">64% Complete (inverse)</span>
                                    </div>
                                </div>

                                <p class="text-lg">
                                    <span class="pull-right">37<sup>%</sup>
                                    </span><i class="fa fa-cloud-upload"></i> Uploading...</p>
                                <div class="progress progress-lg">
                                    <div class="progress-bar progress-bar-inverse" role="progressbar" aria-valuenow="37" aria-valuemin="0" aria-valuemax="100" style="width: 37%">
                                        <span class="sr-only">37% Complete (inverse)</span>
                                    </div>
                                </div>
                            </div>
                            <!--/panel-body-->
                        </div>
                        <!--/panel-->


                        <div id="dashboard-weather" class="panel panel-animated panel-default bg-danger border-danger border-danger">
                            <div class="panel-heading bg-transparent no-border">
                                <h3 class="text-center">Whashington (WA)</h3>
                            </div>
                            <!--/panel-heading-->

                            <div class="panel-body text-center bordered-bottom border-transparent">
                                <p class="text-lg">SAT 08/02</p class="text-lg">
                                <p class="text-64">23&deg;
                                    <canvas id="skycons-wind1" width="64" height="64"></canvas>
                                </p>
                            </div>
                            <!--/panel-body-->

                            <div class="list-group bg-danger">
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-sun" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">29&deg;</div>
                                    SUN 02/02
                                </a>
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-snow" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">15&deg;</div>
                                    MON 03/02
                                </a>
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-cloudy" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">26&deg;</div>
                                    TUE 04/02
                                </a>
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-wind2" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">24&deg;</div>
                                    WED 05/02
                                </a>
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-rain" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">22&deg;</div>
                                    THU 06/02
                                </a>
                                <a class="list-group-item" href="#">
                                    <canvas class="pull-right" id="skycons-fog" width="16" height="16"></canvas>
                                    <div class="list-group-item-text pull-right">25&deg;</div>
                                    FRI 07/02
                                </a>
                            </div>
                            <!--/list-group-->
                        </div>
                        <!--panel-->
                    </div>
                    <!--/cols-->
                </div>
                <!--/row-->





                <div class="row">
                    <div class="col-md-6">
                        <form action="" role="form">
                            
                        </form>
                    </div>
                    <!--/cols-->                                        
                </div>
                <!--/row-->




            </div>
            <!--/content-body -->
        </div>
        <!--/content -->

    </section>
    <!--/content section -->


    <!-- side-right -->
    <aside class="side-right">
        <div class="module" data-toggle="niceScroll">
            <div class="chat-contact">
                <h3 class="contact-heading">
                    <div class="btn-group pull-right">
                        <a href="#" data-toggle="side-right">
                            <i class="fa fa-times text-sm"></i>
                        </a>
                    </div>
                    <i class="fa fa-group"></i> Sala da Fama
                    
                </h3>
                <!-- /contact-heading -->

                <div class="contact-body">
                    <ul class="contacts-list">
                        <li class="separate">Top Mágicos</li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i> Phillip Morrison</a>
                        </li>
                        <li class="offline"><a href="#"><i class="fa fa-circle-o" title="offline" rel="tooltip-bottom"></i> Samuel Porter</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i> Kathy Reynolds</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i> Aaron James</a>
                        </li>
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="idle" rel="tooltip-bottom"></i> Teresa May</a>
                        </li>
                                               
                        <li class="idle"><a href="#"><i class="fa fa-circle-o" title="idle" rel="tooltip-bottom"></i> Rebecca Vargas</a>
                        </li>
                        <li class="online"><a href="#"><i class="fa fa-circle-o" title="online" rel="tooltip-bottom"></i> Sean Carpenter</a>
                        </li>
                    </ul>
                    <!-- /contacts-list -->
                </div>
                <!-- /contact-body -->
            </div>
            <!-- /chat-contact -->

            <div class="chatbox">
                <h3 class="chatbox-heading">
                    <a data-toggle="chatbox-close" href="#" class="pull-right text-sm text-silver"><i class="fa fa-times"></i></a>
                    <i class="fa fa-circle-o text-primary"></i> Phillip Morrison
                </h3>
                <!-- /chatbox-heading -->

                <div class="chatbox-body" data-toggle="niceScroll">

                    <div class="chat-separate">
                        <time class="chat-time" datetime="">Jan 9, 2014</time>
                    </div>

                    <div class="chat-in">
                        <div class="chat-user">Phillip Morrison</div>
                        <div class="chat-msg">
                            <p>Praesent cras quisque. Volutpat sit interdum. Magnis leo, duis faucibus eu, in rutrum nulla. Eget sed, dolor nibh. Vero mi habitant</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">01:14 PM</time>
                        </div>
                    </div>
                    <!-- /chat-in -->

                    <div class="chat-out">
                        <div class="chat-user">Me</div>
                        <div class="chat-msg">
                            <p>Dictum at aenean, faucibus euismod convallis. Ipsum nec, platea amet nulla.</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">01:16 PM</time>
                        </div>
                    </div>
                    <!-- /chat-out -->

                    <div class="chat-in">
                        <div class="chat-user">Phillip Morrison</div>
                        <div class="chat-msg">
                            <p>Eu augue, proin rutrum. Et vehicula, wisi fusce, ut ipsum</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">01:20 PM</time>
                        </div>
                    </div>
                    <!-- /chat-in -->

                    <div class="chat-separate">
                        <time class="chat-time" datetime="">Jan 14, 2014</time>
                    </div>

                    <div class="chat-out">
                        <div class="chat-user">Me</div>
                        <div class="chat-msg">
                            <p>Est penatibus pellentesque, augue tincidunt, a suspendisse</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">09:36 AM</time>
                        </div>
                    </div>
                    <!-- /chat-out -->

                    <div class="chat-in">
                        <div class="chat-user">Phillip Morrison</div>
                        <div class="chat-msg">
                            <p>Nunc nulla. Donec laoreet non, lobortis praesent</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">09:40 AM</time>
                        </div>
                    </div>
                    <!-- /chat-in -->

                    <div class="chat-separate">
                        <time class="chat-time" datetime="">Recent</time>
                    </div>

                    <div class="chat-in">
                        <div class="chat-user">Phillip Morrison</div>
                        <div class="chat-msg">
                            <p>Dui posuere. Reprehenderit felis libero, potenti vitae</p>
                            <time class="chat-time" datetime="2013-12-13T20:00">12 min</time>
                        </div>
                    </div>
                    <!-- /chat-out -->

                </div>
                <!-- /chatbox-body -->

                <div class="chatbox-footer">
                    <form class="chat-form">
                        <p class="chat-status"><i class="fa fa-spinner fa-spin"></i> Phillip Morrison is type...</p>
                        <div class="form-group">
                            <button type="submit" class="btn" title="Send"><i class="fa fa-share"></i>
                            </button>
                            <input type="text" class="chat-input" name="send_chat" placeholder="Type a message" />
                        </div>
                    </form>
                </div>
                <!-- /chatbox -->
            </div>
            <!-- /chatbox -->
        </div>
        <!-- /module -->
    </aside>
    <!--/side-right -->


    <!-- section footer -->
    <a rel="to-top" href="#top"><i class="fa fa-arrow-up"></i></a>
    <footer>
        <p>&copy; 2014 Stilearning</p>
    </footer>



    <!-- javascript
        ================================================== -->
    <!-- List of dependencies file, please check on readme.txt! (Purchase only) -->

    <!-- build:js scripts/vendor-main.js -->
    <!-- bower:js -->
    <script src="bower_components/jquery/jquery.js"></script>
    <script src="bower_components/jqueryui/ui/jquery-ui.js"></script>
    <script src="bower_components/jqueryui-touch-punch/jquery.ui.touch-punch.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-usefull.js -->
    <script src="bower_components/pace/pace.min.js"></script>
    <script src="bower_components/jquery-pjax/jquery.pjax.js"></script>
    <script src="bower_components/masonry/masonry.pkgd.min.js"></script>
    <script src="bower_components/screenfull/dist/screenfull.min.js"></script>
    <script src="bower_components/jquery.nicescroll/jquery.nicescroll.min.js"></script>
    <script src="bower_components/countUp.js/countUp.min.js"></script>
    <script src="bower_components/skycons/skycons.js"></script>
    <script src="bower_components/jquery.lazyload/jquery.lazyload.min.js"></script>
    <script src="bower_components/WOW/dist/wow.min.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-form.js -->
    <script src="bower_components/jquery.validation/jquery.validate.js"></script>
    <script src="bower_components/jquery.validation/additional-methods.js"></script>
    <script src="bower_components/autogrow-textarea/jquery.autogrowtextarea.min.js"></script>
    <script src="bower_components/typeahead.js/dist/typeahead.min.js"></script>
    <script src="bower_components/jQuery-Mask-Plugin/jquery.mask.min.js"></script>
    <script src="bower_components/jquery.tagsinput/jquery.tagsinput.min.js"></script>
    <script src="bower_components/multiselect/js/jquery.multi-select.js"></script>
    <script src="bower_components/select2/select2.js"></script>
    <script src="bower_components/jquery-selectboxit/src/javascripts/jquery.selectBoxIt.js"></script>
    <script src="bower_components/momentjs/moment.js"></script>
    <script src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
    <script src="bower_components/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
    <script src="bower_components/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
    <script src="bower_components/jquery-minicolors/jquery.minicolors.min.js"></script>
    <script src="bower_components/dropzone/downloads/dropzone.min.js"></script>
    <script src="bower_components/jquery-steps/build/jquery.steps.min.js"></script>
    <script src="bower_components/fullcalendar/fullcalendar.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-editor.js -->
    <script src="bower_components/wysihtml5/dist/wysihtml5-0.3.0.js"></script>
    <script src="bower_components/bootstrap-wysihtml5/dist/bootstrap-wysihtml5-0.0.2.js"></script>
    <script src="bower_components/bootstrap-markdown/js/markdown.js"></script>
    <script src="bower_components/bootstrap-markdown/js/to-markdown.js"></script>
    <script src="bower_components/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <!-- endbuild -->


    <!-- build:js scripts/excanvas.js -->
    <!--[if lte IE 8]><script language="javascript" type="text/javascript" src="bower_components/flot/excanvas.min.js"></script><![endif]-->
    <!-- endbuild -->

    <!-- build:js scripts/vendor-graph.js -->
    <script src="bower_components/raphael/raphael-min.js"></script>
    <script src="bower_components/morris.js/morris.min.js"></script>
    <script src="bower_components/flot/jquery.flot.js"></script>
    <script src="bower_components/flot/jquery.flot.resize.js"></script>
    <script src="bower_components/flot/jquery.flot.categories.js"></script>
    <script src="bower_components/flot/jquery.flot.time.js"></script>
    <script src="bower_components/flot-axislabels/jquery.flot.axislabels.js"></script>
    <script src="bower_components/jquery.easy-pie-chart/dist/jquery.easypiechart.js"></script>
    <script src="bower_components/sparkline/dist/jquery.sparkline.min.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-table.js -->
    <script src="bower_components/datatables/media/js/jquery.dataTables.js"></script>
    <script src="bower_components/datatables-tools/js/dataTables.tableTools.js"></script>
    <script src="bower_components/datatables-bootstrap3/BS3/assets/js/datatables.js"></script>
    <script src="bower_components/jquery.tablesorter/js/jquery.tablesorter.js"></script>
    <script src="bower_components/jquery.tablesorter/js/jquery.tablesorter.widgets.js"></script>
    <script src="bower_components/jquery.tablesorter/addons/pager/jquery.tablesorter.pager.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-maps.js -->
    <script src="bower_components/jqvmap/jqvmap/jquery.vmap.min.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.world.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.algeria.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.france.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.germany.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.russia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/jquery.vmap.usa.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.africa.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.asia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.australia.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.europe.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.north-america.js"></script>
    <script src="bower_components/jqvmap/jqvmap/maps/continents/jquery.vmap.south-america.js"></script>
    <script src="bower_components/jqvmap/jqvmap/data/jquery.vmap.sampledata.js"></script>
    <!-- endbuild -->

    <!-- build:js scripts/vendor-util.js -->
    <script src="bower_components/holderjs/holder.js"></script>
    <!-- endbower -->
    <!-- endbuild -->


    <!-- required stilearn template js -->
    <!-- build:js scripts/main.js -->
    <script src="scripts/bootstrap-jasny/js/fileinput.js"></script>
    <script src="scripts/js-prototype.js"></script>
    <script src="scripts/slip.js"></script>
    <script src="scripts/hogan-2.0.0.js"></script>
    <script src="scripts/theme-setup.js"></script>
    <script src="scripts/chat-setup.js"></script>
    <script src="scripts/panel-setup.js"></script>
    <!-- endbuild -->

    <!-- This scripts will be reload after pjax or if popstate event is active (use with class .re-execute) -->
    <!-- build:js scripts/initializer.js -->
    <script class="re-execute" src="scripts/google-code-prettify/run_prettify.js"></script>
    <script class="re-execute" src="scripts/bootstrap-setup.js"></script>
    <script class="re-execute" src="scripts/jqueryui-setup.js"></script>
    <script class="re-execute" src="scripts/dependencies-setup.js"></script>
    <script class="re-execute" src="scripts/demo-setup.js"></script>
    <!-- endbuild -->

</body>

</html>
