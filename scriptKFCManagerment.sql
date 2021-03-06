USE [master]

GO
/****** Object:  Database [KFCManagerment]    Script Date: 4/18/2019 1:25:09 AM ******/
CREATE DATABASE [KFCManagerment]

ALTER DATABASE [KFCManagerment] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [KFCManagerment].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [KFCManagerment] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [KFCManagerment] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [KFCManagerment] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [KFCManagerment] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [KFCManagerment] SET ARITHABORT OFF 
GO
ALTER DATABASE [KFCManagerment] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [KFCManagerment] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [KFCManagerment] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [KFCManagerment] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [KFCManagerment] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [KFCManagerment] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [KFCManagerment] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [KFCManagerment] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [KFCManagerment] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [KFCManagerment] SET  ENABLE_BROKER 
GO
ALTER DATABASE [KFCManagerment] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [KFCManagerment] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [KFCManagerment] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [KFCManagerment] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [KFCManagerment] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [KFCManagerment] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [KFCManagerment] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [KFCManagerment] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [KFCManagerment] SET  MULTI_USER 
GO
ALTER DATABASE [KFCManagerment] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [KFCManagerment] SET DB_CHAINING OFF 
GO
ALTER DATABASE [KFCManagerment] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [KFCManagerment] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [KFCManagerment]
GO
/****** Object:  Table [dbo].[Administrator]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Administrator](
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[IDCus] [int] IDENTITY(100000,1) NOT NULL,
	[CusName] [nvarchar](50) NULL,
	[DateAdd] [varchar](20) NULL,
	[Phone] [varchar](20) NULL,
	[Email] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDCus] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[UsernameEmp] [varchar](50) NOT NULL,
	[Password] [varchar](20) NULL,
	[NameEmp] [nvarchar](50) NULL,
	[Gender] [nvarchar](10) NULL,
	[Birthday] [varchar](20) NULL,
	[Phone] [varchar](20) NULL,
	[Email] [varchar](50) NULL,
	[Address] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[UsernameEmp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[IDOrder] [varchar](20) NOT NULL,
	[IDProduct] [varchar](20) NOT NULL,
	[CusName] [nvarchar](50) NULL,
	[Quantity] [int] NULL,
	[DateOrder] [varchar](50) NULL,
	[TimeOrder] [varchar](50) NULL,
	[UsernameEmp] [varchar](50) NULL,
 CONSTRAINT [PK_OrderDetails] PRIMARY KEY CLUSTERED 
(
	[IDOrder] ASC,
	[IDProduct] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[IDProduct] [varchar](20) NOT NULL,
	[ProductName] [nvarchar](100) NULL,
	[IDType] [varchar](10) NULL,
	[Price] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDProduct] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ProductType]    Script Date: 4/18/2019 1:25:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProductType](
	[IDType] [varchar](10) NOT NULL,
	[TypeName] [nvarchar](50) NULL,
	[Size] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDType] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Administrator] ([Username], [Password]) VALUES (N'admin', N'admin')
SET IDENTITY_INSERT [dbo].[Customer] ON 

INSERT [dbo].[Customer] ([IDCus], [CusName], [DateAdd], [Phone], [Email]) VALUES (100000, N'Vũ Văn Tùng', N'17/04/2017', N'01212692802', N'tung@gmail.com')
INSERT [dbo].[Customer] ([IDCus], [CusName], [DateAdd], [Phone], [Email]) VALUES (100001, N'Nguyễn Huỳnh Thanh Tùng', N'23/04/2017', N'01212692802', N'thanhtung@gmail.com')
INSERT [dbo].[Customer] ([IDCus], [CusName], [DateAdd], [Phone], [Email]) VALUES (100002, N'Nguyễn Ngân', N'20/04/2017', N'01212692802', N'nguyenngan@gmail.com')
INSERT [dbo].[Customer] ([IDCus], [CusName], [DateAdd], [Phone], [Email]) VALUES (100003, N'Nguyễn Văn Trí', N'11/04/2017', N'01212692802', N'tri@gmail.com')
SET IDENTITY_INSERT [dbo].[Customer] OFF
INSERT [dbo].[Employee] ([UsernameEmp], [Password], [NameEmp], [Gender], [Birthday], [Phone], [Email], [Address]) VALUES (N'nguyenhue', N'123456', N'Nguyễn Huệ', N'Nữ', N'22/08/1995', N'0932212333', N'hue@gmail.com', N'15 Gò Vấp')
INSERT [dbo].[Employee] ([UsernameEmp], [Password], [NameEmp], [Gender], [Birthday], [Phone], [Email], [Address]) VALUES (N'nguyenngan', N'123456', N'Nguyễn Ngân', N'Nữ', N'15/02/1996', N'01227971919', N'ngan@gmail.com', N'9 Lê Lợi')
INSERT [dbo].[Employee] ([UsernameEmp], [Password], [NameEmp], [Gender], [Birthday], [Phone], [Email], [Address]) VALUES (N'thanhtung', N'123456', N'Nguyễn Huỳnh Thanh Tùng', N'Nam', N'02/03/1994', N'0124221177', N'thanhtung@gmail.com', N'Tphcm')
INSERT [dbo].[Employee] ([UsernameEmp], [Password], [NameEmp], [Gender], [Birthday], [Phone], [Email], [Address]) VALUES (N'tuongvy', N'123456', N'Tường Vy', N'Nữ', N'01/05/1995', N'0909123456', N'vy@gmail.com', N'12 Lê Hồng Phong')
INSERT [dbo].[Employee] ([UsernameEmp], [Password], [NameEmp], [Gender], [Birthday], [Phone], [Email], [Address]) VALUES (N'vutung', N'123456', N'Vũ Văn Tùng', N'Nam', N'01/01/1996', N'0124566789', N'tung@gmail.com', N'Dĩ an')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0001', N'CF02', N'100003', 4, N'20/10', N'4:am', N'nguyenhue')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0002', N'ES01', N'Khách vãng lai', 2, N'21/10', N'4:am', N'nguyenngan')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0002', N'ST01', N'Khách vãng lai', 1, N'21/10', N'4:am', N'nguyenngan')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0003', N'ES02', N'Khách vãng lai', 1, N'21/10', N'4:am', N'tuongvy')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0003', N'TD01', N'Khách vãng lai', 1, N'21/10', N'4:am', N'tuongvy')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0004', N'CA01', N'Khách vãng lai', 1, N'21/10', N'4:am', N'tuongvy')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0004', N'TD02', N'Khách vãng lai', 3, N'21/10', N'4:am', N'nguyenngan')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0005', N'CE01', N'Khách vãng lai', 2, N'21/10', N'4:am', N'nguyenngan')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0006', N'CF01', N'100001', 2, N'21/10', N'4:am', N'vutung')
INSERT [dbo].[OrderDetails] ([IDOrder], [IDProduct], [CusName], [Quantity], [DateOrder], [TimeOrder], [UsernameEmp]) VALUES (N'HD0006', N'CF05', N'100000', 1, N'21/10', N'4:am', N'vutung')
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CA01', N'CAPPUCCINO', N'T01', 42000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CA02', N'CAPPUCCINO', N'T02', 52000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CA03', N'CAPPUCCINO', N'T03', 62000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CE01', N'Cam ép', N'T04', 35000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CE02', N'Cam ép', N'T05', 40000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF01', N'Cà phê đá', N'T01', 20000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF02', N'Cà phê đá', N'T02', 25000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF03', N'Cà phê đá', N'T03', 30000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF04', N'Cà phê sữa đá', N'T01', 25000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF05', N'Cà phê sữa đá', N'T02', 30000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'CF06', N'Cà phê sữa đá', N'T03', 35000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'ES01', N'ESPRESSO MILK', N'T01', 30000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'ES02', N'ESPRESSO MILK', N'T02', 40000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'ES03', N'ESPRESSO MILK', N'T03', 50000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'ST01', N'Sinh tố thập cẩm', N'T04', 50000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'ST02', N'Sinh tố thập cẩm', N'T05', 60000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'TD01', N'Trà đào', N'T04', 40000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'TD02', N'Trà đào', N'T05', 50000)
INSERT [dbo].[Product] ([IDProduct], [ProductName], [IDType], [Price]) VALUES (N'TD03', N'Trà đào', N'T06', 60000)
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T01', N'Cà phê', N'Nhỏ')
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T02', N'Cà phê', N'Vừa')
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T03', N'Cà phê', N'Lớn')
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T04', N'Nước trái cây', N'Nhỏ')
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T05', N'Nước trái cây', N'Vừa')
INSERT [dbo].[ProductType] ([IDType], [TypeName], [Size]) VALUES (N'T06', N'Nước trái cây', N'Lớn')
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([IDProduct])
REFERENCES [dbo].[Product] ([IDProduct])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetails_Employee] FOREIGN KEY([UsernameEmp])
REFERENCES [dbo].[Employee] ([UsernameEmp])
GO
ALTER TABLE [dbo].[OrderDetails] CHECK CONSTRAINT [FK_OrderDetails_Employee]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD FOREIGN KEY([IDType])
REFERENCES [dbo].[ProductType] ([IDType])
GO
USE [master]
GO
ALTER DATABASE [KFCManagerment] SET  READ_WRITE 
GO
