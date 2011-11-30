//
//  LoccaAppDelegate.h
//  Locca
//
//  Created by Greg Hughes on 26/11/2011.
//  Copyright 2011 Junction Software Ltd. All rights reserved.
//

#import <UIKit/UIKit.h>

@class LoccaViewController;

@interface LoccaAppDelegate : NSObject <UIApplicationDelegate>

@property (nonatomic, retain) IBOutlet UIWindow *window;

@property (nonatomic, retain) IBOutlet LoccaViewController *viewController;

@end
