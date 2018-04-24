-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 10, 2017 at 05:15 PM
-- Server version: 5.6.34-log
-- PHP Version: 7.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `notwegmansonline`
--

-- --------------------------------------------------------

--
-- Table structure for table `collegedomains`
--

CREATE TABLE `collegedomains` (
  `collegedomains` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `collegedomains`
--

INSERT INTO `collegedomains` (`collegedomains`) VALUES
('cornell.edu'),
('drexel.edu'),
('immaculata.edu'),
('princeton.edu'),
('rutgers.edu'),
('temple.edu'),
('ursinus.edu'),
('villanova.edu'),
('westchester.edu'),
('yale.edu');

-- --------------------------------------------------------

--
-- Table structure for table `groceries`
--

CREATE TABLE `groceries` (
  `itemID` int(2) NOT NULL,
  `name` varchar(30) NOT NULL,
  `price` decimal(4,2) NOT NULL,
  `description` varchar(50) NOT NULL,
  `imageName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groceries`
--

INSERT INTO `groceries` (`itemID`, `name`, `price`, `description`, `imageName`) VALUES
(1, 'Apple', 0.99, 'Red delicious apple.', 'apple.png'),
(2, 'Bagel', 1.29, 'Fresh baked everyday.', 'bagel.png'),
(3, 'Banana', 0.29, 'Fresh bananas imported from Ecuador.', 'banana.png'),
(4, 'Baked Beans', 1.99, 'The perfect choice for a barbecue.', 'beans.png'),
(5, 'Beef', 8.99, 'Prime US Choice Beef.', 'beef.png'),
(6, 'Bread', 4.49, 'Fresh baked NotWegmans bread.', 'bread.png'),
(7, 'Broccoli', 2.99, 'Delicious mini trees.', 'broccoli.png'),
(8, 'Carrots', 4.99, 'So good a rabbit would eat them.', 'carrots.png'),
(9, 'Cheerios', 6.99, 'Good ol\' cheerios, a heart healthy choice.', 'cheerios.png'),
(10, 'Cheese', 3.99, 'Fresh block of swiss.', 'cheese.png'),
(11, 'Chicken', 8.99, 'Delicious raw flightless bird.', 'chicken.png'),
(12, 'Chips', 3.59, 'Crunchy potato chips.', 'chips.png'),
(13, 'Coca Cola', 12.99, 'Refreshing cola soft drink.', 'cocacola.png'),
(14, 'Cookies', 2.89, 'Chocolate chip cookies that are to die for.', 'cookie.png'),
(15, 'Corn', 3.99, 'Corn cobs ready for the barbecue.', 'corn.png'),
(16, 'Frosted Flakes', 7.49, 'Frosted corn flakes, perfect for breakfast.', 'frostedflakes.png'),
(17, 'Fruit Loops', 7.29, 'Fruit flavored o\'s Toucan Sam can\'t resist.', 'fruitloops.png'),
(18, 'Grapes', 2.19, 'From the local vineyard.', 'grapes.png'),
(19, 'Hot Dogs', 9.99, 'So good you\'ll feel like you\'re at the ballpark.', 'hotdog.png'),
(20, 'Ice Cream', 10.99, 'Creamy ice cream, perfect for a hot day.', 'icecream.png'),
(21, 'Lettuce', 3.99, 'Iceberg lettuce for sandwiches and salads.', 'lettuce.png'),
(22, 'Lunchable', 7.39, 'Kids lunches just got way better.', 'lunchable.png'),
(23, 'Mackerel', 9.59, 'Smells fishy.', 'mackerel.png'),
(24, 'Milk', 10.99, 'Organic, GMO free.', 'milk.png'),
(25, 'Orange', 0.99, 'Fresh Florida oranges.', 'orange.png'),
(26, 'Pear', 0.99, 'Grown right over in Lancaster, PA.', 'pear.png'),
(27, 'Peas', 3.59, 'Like peas in a pod.', 'peas.png'),
(28, 'Pepsi', 12.99, 'Fresh new look, same great taste.', 'pepsi.png'),
(29, 'Pork', 11.99, 'Choice cut of pork.', 'pork.png'),
(30, 'Potato', 0.99, 'The apples of the earth.', 'potato.png'),
(31, 'Salmon', 9.89, 'Alaskan salmon, stolen from a bear.', 'salmon.png'),
(32, 'Soup', 2.99, 'Creamy Campbell\'s tomato soup.', 'soup.png'),
(33, 'Tilapia', 6.99, 'FISH!', 'tilapia.png'),
(34, 'Turkey', 15.99, 'Don\'t forget to pick one up this Thanksgiving.', 'turkey.png');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(25) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('Abigail', 'BucketOfWater'),
('Adam', 'BestCoderEver'),
('Admin', 'AdminPass'),
('Amanda', 'LoveTigers'),
('Billy', 'UpDog'),
('Brock', 'President'),
('Daniel', 'Greenleaf'),
('Janice', 'SoCold'),
('Kevin', 'Blevin'),
('Larry', 'MyFault'),
('Mary', 'Contrarian'),
('Oscar', 'OZPINHEAD'),
('Susan', 'SaveTheWhales'),
('Thomas', 'Military'),
('WDG', 'AlwaysWatching');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `collegedomains`
--
ALTER TABLE `collegedomains`
  ADD UNIQUE KEY `collegedomains` (`collegedomains`);

--
-- Indexes for table `groceries`
--
ALTER TABLE `groceries`
  ADD PRIMARY KEY (`itemID`),
  ADD UNIQUE KEY `itemID` (`itemID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `groceries`
--
ALTER TABLE `groceries`
  MODIFY `itemID` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
