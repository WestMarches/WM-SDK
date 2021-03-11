export * from './campaign.service';
import { CampaignService } from './campaign.service';
export * from './character.service';
import { CharacterService } from './character.service';
export * from './discord.service';
import { DiscordService } from './discord.service';
export * from './registration.service';
import { RegistrationService } from './registration.service';
export * from './user.service';
import { UserService } from './user.service';
export const APIS = [CampaignService, CharacterService, DiscordService, RegistrationService, UserService];